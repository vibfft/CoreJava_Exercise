package com.vibfft;

import java.util.Objects;
import java.util.Scanner;

public class UserRecordExercise extends Exercise {

    ExType type;
    ExLevel level;

    UserRecordExercise() {
        type = ExType.SCANNER;
        level = ExLevel.EASY;
    }
}

final class User extends UserRecordExercise{

    private final String username;
    private final String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String username() {
        return username;
    }

    public String password() {
        return password;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        var that = (User) obj;
        return Objects.equals(this.username, that.username) &&
                Objects.equals(this.password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    @Override
    public String toString() {
        return "User[" +
                "username=" + username + ", " +
                "password=" + password + ']';
    }


}

// record is much simpler compared to class in this usage
//public record User(String username, String password) {
//    public User {
//        if (username == null || password == null) {
//            throw new IllegalArgumentException("Username and password must not be null");
//        }
//    }
//}
