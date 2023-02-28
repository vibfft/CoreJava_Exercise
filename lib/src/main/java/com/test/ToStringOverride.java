package com.test;

import java.util.Arrays;

public class ToStringOverride {
}

class Book extends ToStringOverride {

    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "title=" + this.title + ",yearOfPublishing=" + this.yearOfPublishing + ",authors=" + "[" + String.join(",",authors) + "]";
    }

    public static void main(String[] args) {
        Book bk = new Book("Java 8 & 9 in Action", 2017, new String[]{"Mario Fusco","Alan Mycroft"});
        //Book bk = new Book("Java 8 & 9 in Action", 2017, new String[]{"Mario Fusco"});
        System.out.println(bk);
    }
}