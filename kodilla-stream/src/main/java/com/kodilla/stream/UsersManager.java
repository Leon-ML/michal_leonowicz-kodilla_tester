package com.kodilla.stream;

public class UsersManager {
    public static void main(String[] args) {
        UserRepository.getUsersList()
                .stream()
                .map(u -> u.getUsername())
                .forEach(un -> System.out.println(un));
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

}

