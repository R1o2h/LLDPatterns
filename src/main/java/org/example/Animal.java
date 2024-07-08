package org.example;

public class Animal implements Eatable{
       String name;
       int age;
       String colour;
       int weight;
     void sayName() {
            System.out.println("My name is" + name);
     }
     public void eat() {
         System.out.println("Animal is eating");
     }
}
