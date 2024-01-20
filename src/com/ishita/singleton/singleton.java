package com.ishita.singleton;

public class singleton {


    private singleton(){

    }
    private static  singleton a;

    public static  singleton geta(){
        if(a==null)
        {
            a=new singleton();
        }
        return a;

    }
}
