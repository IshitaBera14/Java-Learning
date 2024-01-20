package com.ishita.properties.inheritance;

public class Main {
    public static void main(String[] args) {
       Box a = new Box(4);
        Box b = new Box(a);

      // System.out.println(b.l +" "+ b.h +" "+ b.w);

        BoxWeight c = new BoxWeight();
       // System.out.println(c.weight +" "+ c.h);

        BoxWeight d = new BoxWeight(1 , 2, 3, 4);
       //System.out.println( d.weight);

        Box e = new BoxWeight(1 , 2 , 2, 3);
     //   System.out.println(e.w);

       // BoxWeight f = new Box(1,2,3);

     //   BoxWeight f = new BoxWeight();
      //  System.out.println(f.weight);

        BoxPrice box = new BoxPrice(5,8,1);
    }
}
