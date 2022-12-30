package com.pages;

public class Hatirlatma {


    public static void main(String[] args) {
        System.out.println("main method calisti");
        a1();
        a2();
    }
    public static void a1(){

    }
    static {
        System.out.println("static 2");
    }
    public static void a2(){
        System.out.println("a2 methodu calisti");
    }
    static {
        System.out.println("static 1");
    }
}
