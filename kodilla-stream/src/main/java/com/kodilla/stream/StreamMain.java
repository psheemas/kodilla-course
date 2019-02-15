package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        new Forum().getForumUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> forumUser.getPublishedPosts()>1)
                .filter(forumUser -> Period.between(forumUser.getBirthDate(), LocalDate.now()).getYears()>=20)
                .collect(Collectors.toMap(ForumUser::getUserOwnNumber, forumUser -> forumUser)).entrySet().stream()
                    .map(entry-> entry.getKey() + " : " + entry.getValue())
                    .forEach(System.out::println);
    }
}