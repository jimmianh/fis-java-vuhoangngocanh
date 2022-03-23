package com.company;

public class Main {

    public static void main(String[] args) {
        Foo f1 = new Foo();
        f1.setValue("123");
        Foo f2 = new Foo();
        f2.setValue("abc");

        System.out.println("f1:" + f1.getValue() + "| f2 :" + f2.getValue() +" | eq: " + (f1 == f2) );
    }
}
class Foo{
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}