package com.ishita.staticExample;

public class StaticBlock {
    static int a=5;
    static int b;

    static{
        System.out.println("i am static block");
        b=a*4;
    }

    public static void main(String[] args) {

        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }

}
