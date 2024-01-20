package com.ishita.staticExample;

public class human {
    int gae;
    String name;
    int salary;
    boolean gender;
    static long population;

    static void message(){
        System.out.println("hi");

       // System.out.println(this.age);
    }
     void message1(){
        System.out.println("hi123");

        // System.out.println(this.age);
    }

    public human(int gae, String name, int salary, boolean gender) {
        this.gae = gae;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        human.population += 1;
    }
}
