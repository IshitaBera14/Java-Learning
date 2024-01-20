package com.ishita.introduction;

public class intro {
    public static void main(String[] args) {

        // data of 5 student
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        //own data type
        Student[] a = new Student[5];


        Student ish = new Student("ishita ", 40 );
        Student random = new Student(ish);
       // System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name="something";
        System.out.println(two.name);
        // ish.name="ishita";
        // ish.rno=20;
        // System.out.println(ish.rno);


       // ish.changename("xyz");
        //ish.greeting();
    }
}

    //create a class
    class Student {
        int rno;
        String name ;
        float marks;
        void changename(String newName){
            name = newName;
        }

        void greeting(){
            System.out.println("my name is "+this.name);
        }


        Student(){
           this ("xyz" ,15);
        }

        Student(String name , int rno){
            this.name=name;
            this.rno=rno;
        }

         Student(Student other){
            this.name=other.name;
            this.rno=other.rno;
        }



    }

