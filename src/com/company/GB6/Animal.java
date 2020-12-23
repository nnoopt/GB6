package com.company.GB6;

import java.util.Random;

public abstract class Animal {

    public double rand (double d){
        int e = (int)(d*10);
        Random r = new Random();
        double f = r.nextInt(e+1);
        return (f/10) + (d/2);
    }

    public abstract void run (double a);

    public abstract void jump (double a);

    public abstract void swim (double a);


}
