package com.ishita.properties.inheritance;

public class Box {

    double l;
    double h;
    double w;
   // double weight;

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
       // this.weight = -1;

    }

    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

     Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public Box(double l, double h, double w, double weight) {
        this.l = -1;
        this.h = h;
        this.w = w;
       // this.weight = -1;
    }

    public void information(){
        System.out.println("this is box");
    }
}
