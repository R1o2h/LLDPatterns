package FactoryDesignPattern;

import java.awt.*;

public interface FlutterExecutor {
      void startApp();

      void printHelloWorld();
      Button createList();
      FlutterExecutorUIComponentFactory getUIComponentFactory();

}

// 1. Factory Class:
// XFactory
// Return objects of class X or any class that IS-A X


// 2. Factory Method
// A Method in a normal class that tends to create an object of a subclass of a parent class.
// eg: createButton()-> Button or any of its subclasses

//3. Abstract Factory
// A class that has a collection of methods each creating an object a particular type.

//interface DressFactory {  Abstract Class
//      Shirt createShirt();
//      Trouser createTrouser();
//}
//class WinterDressFactory() {
//      createShirt() {
//            return new WoolenShirt();
//      }
//
//      createTrouser() {
//            return new WhiteTrouser();
//      }
//}
//
//class DressFactory() {  Factory Class
//      Dress createWinterDress() {
//            return new Dress(new WoolenShirt(), new WhiteTrouser());
//      }
//      Dress createSummerDress() {
//            return new Dress(new SummerShirt(), new SummerTrouser());
//      }
//}