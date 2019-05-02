package forumuser;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public final class Forum {
List<ForumUser> theForumUsers = new ArrayList<>();
public Forum(){
    theForumUsers.add(new ForumUser(1,"Nemo",'M', 2000, 6, 20, 120));
    theForumUsers.add(new ForumUser(2,"Katia", 'F', 1989, 12, 24, 0 ));
    theForumUsers.add(new ForumUser(3, "Stefan", 'M', 1978, 7,31,10));
    theForumUsers.add(new ForumUser(4,"Alex", 'F', 2000,5,1,0));
}

    public List<ForumUser> getTheForumUsers() {
        return new ArrayList<>(theForumUsers);
    }
}
