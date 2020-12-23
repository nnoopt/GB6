package com.company.GB6;

public class Cat extends Animal {

    double run = rand(200);
    double jump = rand(2);
    double swim=0;

    @Override
    public void run (double a){
        boolean b = (a <= run);
        System.out.println("run: " + b + " " + run);
    }

    @Override
    public void jump(double a) {
        boolean b = (a <= jump);
        System.out.println("jump: " +  b + " " + jump);
    }

    @Override
    public void swim(double a) {
        System.out.println("swim: " + false+  " " + swim);
    }

}
