package com.test;

class TrickyProblem {

    protected int field;

    public TrickyProblem(int val) {
        this.field = val + 1;
    }
}

class B extends TrickyProblem {

    protected int field;

    public B(int val) {
        super(val);
        this.field = super.field * 2;
    }
}

class C extends B {

    protected int field;

    public C(int val) {
        super(val);
        this.field = super.field + 2;
    }

    public void printField() {
        System.out.println(super.field);
    }
}

class TestC {

    public static void main(String[] args) {
        C c = new C(2);
        c.printField();
    }
}