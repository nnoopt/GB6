package com.company.GB6;

public class Main {

    public static void main(String[] args) {

        Animal [] cats = new Cat[3];

        for (int i = 0; i < cats.length; i++) {
            System.out.println("Кот № " + (i+1) + " =========");
            cats[i] = new Cat();
            cats[i].run(200);
            cats[i].jump(2);
            cats[i].swim(2);
        }

        Animal [] dogs = new Dog [3];

        for (int i = 0; i < cats.length; i++) {
            System.out.println("Пес № " + (i+1) + " =========");
            dogs[i] = new Dog();
            dogs[i].run(500);
            dogs[i].jump(0.5);
            dogs[i].swim(10);
        }

    }
}
