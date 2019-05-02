package forumuser;

import java.time.LocalDate;

public final class ForumUser {
private final int id;
private final String userName;
private final char sex;
private final LocalDate birthDate;
private final int publishedPosts;


    public ForumUser(final int id, final String userName, final char sex, final int year, final int month, final int day, final int publishedPosts) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(year, month, day);
        this.publishedPosts = publishedPosts;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublishedPosts() {
        return publishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", publishedPosts=" + publishedPosts +
                '}';
    }
}

