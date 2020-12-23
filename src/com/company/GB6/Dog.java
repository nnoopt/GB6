package com.company.GB6;

public class Dog extends Animal {

    double run = rand(500);
    double jump = rand(0.5);
    double swim=rand(10);

    @Override
    public void run (double a){
        boolean b = (a <= run);
        System.out.println("run: " + b + " " + run);
    }

    @Override
    public void jump(double a) {
        boolean b = (a <= jump);
        System.out.println("jump: " + b + " " + jump);
    }

    @Override
    public void swim(double a) {
        boolean b = (a <= swim);
        System.out.println("swim: " + b + " " + swim);
    }


}
