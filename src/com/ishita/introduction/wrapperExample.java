package com.ishita.introduction;

public class wrapperExample {
    public static void main(String[] args) {
       // int a=10;
      //  Integer num = new Integer(23);

       // final int  a = 10;
       // a = 20 ;
       final A ish = new A("ishita bera");
       ish.name="other name";

      A obj;
       for(int i=0 ; i<=1000000000 ; i++){
           obj = new A("random NAME");
       }
    }
}
class A{
    final int a =10;
    String name;

    public A(String name){
        this.name=name;
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("object is destroy");
    }

}
