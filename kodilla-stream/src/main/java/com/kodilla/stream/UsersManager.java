package com.kodilla.stream;

import java.util.List;
import java.util.stream.Stream;

public class UsersManager {
    public static void main(String[] args) {
        UserRepository.getUsersList();List<User>
                .stream() Stream<User>
                .map(u u.getUsername()) Stream<String>
                .forEach(un - System.out.println(un));

public static String getUserName( User user){
    return user.getUsername();
        }

    }
}
