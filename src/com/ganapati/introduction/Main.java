package com.ganapati.introduction;

public class Main {

    public static void main(String[] args) {
        Student one = new Student();
        Student two = one;

        two.rno = 11;
        System.out.println(one.rno);
    }
}

class Student {

    int rno;
    String name;

    Student() {
        this(15, "Ganeshji");
    }

    Student(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
