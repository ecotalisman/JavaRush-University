package ua.javarush.task.jdk13.task38.task3804;

@Entity(name = "SocialUserEntity")
public class SocialUser extends User {

    private String socialId;
    public SocialUser(int id, String displayName, String email, String socialId) {
        super(id, displayName, email);
        this.socialId = socialId;
    }
}
