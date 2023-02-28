package com.vibfft;

import java.util.Scanner;

public abstract class ToStringTwoExercise extends Exercise {

    ExType type;
    ExLevel level;

    ToStringTwoExercise() {
        type = ExType.SCANNER;
        level = ExLevel.EASY;
    }

}

class Account {

    private long id;
    private String code;
    private Long balance;

    public Account(long id, String code, Long balance) {
        this.id = id;
        this.code = code;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{id=" + id + ", code='" + code + "', balance=" + balance + "}";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split("\\s+");

        long id = Long.parseLong(parts[0]);
        String code = parts[1];
        long balance = Long.parseLong(parts[2]);

        Object acc = new Account(id, code, balance);

        System.out.println(acc.toString());
    }
}
