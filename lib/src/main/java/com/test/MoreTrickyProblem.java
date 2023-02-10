package com.test;

public class MoreTrickyProblem {

}

class Aa extends MoreTrickyProblem {
    protected int n = 10;
}

class Bb extends Aa {
    protected int n = 20;

    public Bb() {
        super();
        System.out.println("Bb: " + n);
    }
}

class Cc extends Bb {
    protected int n = 30;

    public Cc() {
        this(5);
        System.out.println("Cc: " + n);
    }

    public Cc(int n) {
        super();
        super.n = n;
        System.out.println("CC constructor: " + n);
    }
}

class TestMain {
    public static void main(String[] args) {
        Cc c = new Cc();
    }
}
