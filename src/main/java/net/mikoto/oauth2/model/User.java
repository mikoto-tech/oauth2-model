package net.mikoto.oauth2.model;

import net.mikoto.oauth2.model.annotation.ForbiddenField;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author mikoto
 * @date 2022/2/1 19:22
 * <br/>
 * sql:
 * <p>
 * create table pixiv.user<br/>
 * (<br/>
 *     pk_user_id      bigint unsigned auto_increment<br/>
 *         primary key,<br/>
 *     user_name       varchar(25) not null,<br/>
 *     user_password   varchar(64) not null,<br/>
 *     user_salt       varchar(10) not null,<br/>
 *     insert_artworks tinyint(1)  not null,<br/>
 *     r18             tinyint(1)  not null,<br/>
 *     r18g            tinyint(1)  not null,<br/>
 *     create_time     datetime    not null,<br/>
 *     update_time     datetime    not null,<br/>
 *     constraint user_pk_user_id_uindex<br/>
 *         unique (pk_user_id),<br/>
 *     constraint user_user_name_uindex<br/>
 *         unique (user_name)<br/>
 * );<br/>
 * <p/>
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "pk_user_id", nullable = false, unique = true)
    private int userId;
    private String userName;
    @ForbiddenField
    private String userPassword;
    @ForbiddenField
    private String userSalt;
    private Date createTime;
    private Date updateTime;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
