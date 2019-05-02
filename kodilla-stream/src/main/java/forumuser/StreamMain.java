package forumuser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String ... args){
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theForumMap = theForum.getTheForumUsers().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getPublishedPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));
        theForumMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
