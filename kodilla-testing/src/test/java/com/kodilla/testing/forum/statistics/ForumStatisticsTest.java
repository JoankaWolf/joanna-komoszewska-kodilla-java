package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTest {

    @Test
    public void testStatisticsMeanPostsPerUserNoPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<10; i++){
            listMock.add("User");
        }
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getPostsNumber());
        assertEquals(0, forumStatistics.getAvgNumberOfPostsPerUser(), 0.01);
        assertEquals(0, forumStatistics.getAvgNumberOfCommentsPerPost(), 0.01);

    }
    @Test
    public void testCalculateAdvStatisticsThousandPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<10; i++){
            listMock.add("User");
        }
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(450);
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, forumStatistics.getPostsNumber());
        assertEquals(100, forumStatistics.getAvgNumberOfPostsPerUser(), 0.001);
        assertEquals(0.45, forumStatistics.getAvgNumberOfCommentsPerPost(), 0.001);
    }
    @Test
    public void testCalculateAdvStatisticsZeroComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<10; i++){
            listMock.add("User");
        }
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getCommentsNumber());
        assertEquals(0, forumStatistics.getAvgNumberOfCommentsPerUser(), 0.001);
        assertEquals(0, forumStatistics.getAvgNumberOfCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsLessCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<10; i++){
            listMock.add("User");
        }
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(20);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(10, forumStatistics.getUsersNumber());
        assertEquals(20, forumStatistics.getPostsNumber());
        assertEquals(5, forumStatistics.getCommentsNumber());
        assertEquals(2, forumStatistics.getAvgNumberOfPostsPerUser(), 0.001);
        assertEquals(0.5, forumStatistics.getAvgNumberOfCommentsPerUser(), 0.001);
        assertEquals(0.25, forumStatistics.getAvgNumberOfCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<10; i++){
            listMock.add("User");
        }
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(20);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(10, forumStatistics.getUsersNumber());
        assertEquals(20, forumStatistics.getPostsNumber());
        assertEquals(100, forumStatistics.getCommentsNumber());
        assertEquals(2, forumStatistics.getAvgNumberOfPostsPerUser(), 0.001);
        assertEquals(10, forumStatistics.getAvgNumberOfCommentsPerUser(), 0.001);
        assertEquals(5, forumStatistics.getAvgNumberOfCommentsPerPost(), 0.001);
    }
    @Test
    public void testCalculateAdvStatisticsWithZeroUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(20);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getUsersNumber());
        assertEquals(0, forumStatistics.getAvgNumberOfPostsPerUser(), 0.001);
        assertEquals(0, forumStatistics.getAvgNumberOfCommentsPerUser(), 0.001);

    }

    @Test
    public void testCalculateAdvStatisticsHundredUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<100; i++){
            listMock.add("User");
        }
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(20);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getUsersNumber());
        assertEquals(0.2, forumStatistics.getAvgNumberOfPostsPerUser(), 0.01);
        assertEquals(1, forumStatistics.getAvgNumberOfCommentsPerUser(), 0.01);
    }
}