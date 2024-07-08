package org.example;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) {
//        Animal a = new Animal();
//        a.name="Wolf";
//        Dog d = new Dog();
//        d.name="Lion";
//       // a=d;
//        a.sayName();
//        d.sayName();
//        //d=a;(parent class should not be inherit)
//        a=new Cat();
//        d=new Dog();
//
//        d.bark();//we can use dog method in dog datatype
//
//        Animal g = new Dog();
//     //   g.breed(); (Its an example of Polymorphism, we cannot use dog behaviour/ methods in Animal datatype variable
//          g=new Cat();
//        List<Animal> animals =
//                List.of(
//                        new Dog(),
//                        new Cat(),
//                        new Dolphin(),
//                        new Husky()
//                );  // This List will get the base attributes only animal class not other sub classes attributes
//        for(Animal as : animals) {
//            as.colour="Green";
//
            Animal i=new Husky();
            i.name="Tommy";
            i.sayName();
            //Husky-> Dog-> Animal-> Object

           Runnable ro=new Dog();
           ro.run();
           Runnable hi=new Horse();
           hi.run();
           Runnable th= new Husky();
           th.run();
           Runnable we= new Pug();
           we.run();
           Eatable ji=new Animal();
           ji.eat();
        }
    }