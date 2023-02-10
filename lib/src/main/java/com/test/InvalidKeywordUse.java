package com.test;

public class InvalidKeywordUse {
}

class Aaa extends InvalidKeywordUse {

    protected int a;
}

class Bbb extends Aaa {

    protected int b;

    public Bbb(int a, int b) {
        super();     // 1
        super.a = a; // 2
        //super.b = b; // 3
        this.b = b;
    }
}

class Ccc extends Bbb {

    protected int c;


    public Ccc(int a, int b) {
        //super(a); // 4
        super(a, b);
    }

    public Ccc(int a) {
        super(a, 10); // 5
    }
}
