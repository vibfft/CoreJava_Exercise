package com.vibfft;

public class Tiger {
    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Rrrrrrr!");
    }

    protected void run() {
        System.out.println(this.name + " is running!");
    }
}
