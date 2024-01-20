package com.ishita.properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -2;
    }
    BoxWeight(BoxWeight x){
        super(x);
        weight=x.weight;
    }

    BoxWeight(double side , double weight){
        super(side);
        this.weight=weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
       // System.out.println(super.weight);
        this.weight = weight;


    }
}
