package com.ishita.staticExample;

public class main {
    public static void main(String[] args) {



        human a = new human(11, "abc", 10000, true);
        human b = new human(12, "abcd", 20000, false);
        human c = new human(12, "abcd", 20000, false);
        c.message1();
       // System.out.println(human.population);
        //System.out.println(b.population);
       human.message();


       // greeting();
        main funn=new main();
        funn.fun2();
    }
    static void fun(){
       // greeting();

        main obj = new main();
        obj.greeting();

    }
    void fun2(){
        greeting();
    }
    void greeting()
    {

        System.out.println("hello world");
    }
}

