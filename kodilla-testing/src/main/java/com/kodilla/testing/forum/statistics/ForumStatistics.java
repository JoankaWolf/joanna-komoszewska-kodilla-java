package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double avgNumberOfPostsPerUser;
    private double avgNumberOfCommentsPerUser;
    private double avgNumberOfCommentsPerPost;

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAvgNumberOfPostsPerUser() {
        return avgNumberOfPostsPerUser;
    }

    public double getAvgNumberOfCommentsPerUser() {
        return avgNumberOfCommentsPerUser;
    }

    public double getAvgNumberOfCommentsPerPost() {
        return avgNumberOfCommentsPerPost;
    }

    void calculateAdvStatistics(Statistics statistics) {
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        avgNumberOfPostsPerUser = calculateAvgNumbersOfPostsPerUser();
        avgNumberOfCommentsPerUser = calculateAvgNumbersOfCommentsPerUser();
        avgNumberOfCommentsPerPost = calculateAvgNumbersOfCommentsPerPosts();
    }

        private double calculateAvgNumbersOfPostsPerUser () {

            if (usersNumber > 0) {
                return (double) postsNumber / usersNumber;
            } else {
                return 0;
            }
        }

        private double calculateAvgNumbersOfCommentsPerUser () {
            if (usersNumber > 0) {
                return (double) commentsNumber / usersNumber;
            } else {
                return 0;
            }
        }

        private double calculateAvgNumbersOfCommentsPerPosts () {
            if (postsNumber > 0) {
                return (double) commentsNumber / postsNumber;
            } else {
                return 0;
            }
        }

        public void showStatistics () {
            System.out.println("Users numbers: " + usersNumber);
            System.out.println("Posts numbers: " + postsNumber);
            System.out.println("Comments numbers: " + commentsNumber);
            System.out.println("Posts average per user" + avgNumberOfPostsPerUser);
            System.out.println("Comments average per user" + avgNumberOfCommentsPerUser);
            System.out.println("Comments average per post" + avgNumberOfCommentsPerPost);
        }
}
