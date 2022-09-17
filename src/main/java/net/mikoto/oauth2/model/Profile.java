package net.mikoto.oauth2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.Objects;

/**
 * @author mikoto
 * {@code @time} 2022/9/18
 * Create for oauth2-model
 * <br/>
 * sql:
 * <p>
 *     create table pixiv.profile<br/>
 * (<br/>
 *     pk_user_id    bigint unsigned      not null<br/>
 *         primary key,<br/>
 *     profile_image varchar(256)         null,<br/>
 *     relate_client bigint unsigned      null,<br/>
 *     r18           tinyint(1) default 0 null,<br/>
 *     r18g          tinyint(1) default 0 null,<br/>
 *     gender        varchar(6)           null,<br/>
 *     birthday      datetime             null,<br/>
 *     constraint pk_user_id<br/>
 *         unique (pk_user_id)<br/>
 * );<br/>
 * </p>
 */
@Entity
public class Profile {
    @Id
    @Column(name = "pk_user_id", nullable = false, unique = true)
    private int userId;
    private String profileImage;
    private int relatedClient;
    private boolean r18;
    private boolean r18g;
    private Gender gender;
    private Date birthday;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public int getRelatedClient() {
        return relatedClient;
    }

    public void setRelatedClient(int relatedClient) {
        this.relatedClient = relatedClient;
    }

    public boolean isR18() {
        return r18;
    }

    public void setR18(boolean r18) {
        this.r18 = r18;
    }

    public boolean isR18g() {
        return r18g;
    }

    public void setR18g(boolean r18g) {
        this.r18g = r18g;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return userId == profile.userId && relatedClient == profile.relatedClient && r18 == profile.r18 && r18g == profile.r18g && Objects.equals(profileImage, profile.profileImage) && gender == profile.gender && Objects.equals(birthday, profile.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, profileImage, relatedClient, r18, r18g, gender, birthday);
    }

    @Override
    public String toString() {
        return "Profile{" +
                "userId=" + userId +
                ", profileImage='" + profileImage + '\'' +
                ", relatedClient=" + relatedClient +
                ", r18=" + r18 +
                ", r18g=" + r18g +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }
}
