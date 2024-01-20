package com.ishita.staticExample;
 class Test{
  static String name;

    public Test(String name) {
        this.name = name;
    }
}

public class InnerClasses {


    public static void main(String[] args) {
       Test a = new Test("ish");
       Test b = new Test("jas");

        System.out.println(a.name);
        System.out.println(b.name);

    }
}


