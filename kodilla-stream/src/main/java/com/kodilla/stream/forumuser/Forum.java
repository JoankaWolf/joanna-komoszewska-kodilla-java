package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List <ForumUser> theForumUsers = new ArrayList<>();
        public Forum () {
            theForumUsers.add(new ForumUser(111, "Johny", 'M', 1987, 11, 15, 255));
            theForumUsers.add(new ForumUser(112, "LolaJ", 'F', 2001, 12, 11, 85));
            theForumUsers.add(new ForumUser(113, "BradP", 'M', 1955, 10, 12, 123));
            theForumUsers.add(new ForumUser(114, "WandaStar", 'F', 1999, 5, 12, 330));
            theForumUsers.add(new ForumUser(115, "TracyLoland", 'F', 1985, 1, 15, 133));
            theForumUsers.add(new ForumUser(116, "Bunny", 'M', 2004, 6, 12, 0));
            theForumUsers.add(new ForumUser(117, "Amber", 'F', 2003, 11, 30, 213));
            theForumUsers.add(new ForumUser(118, "Casandra", 'F', 1983, 9, 22, 698));
            theForumUsers.add(new ForumUser(119, "Lion", 'M',1999,4,26,500));
            theForumUsers.add(new ForumUser(120, "Brandon", 'M', 1995, 12, 12, 856));
        }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUsers);
    }
}
