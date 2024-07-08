package org.example;

public class Dog extends Animal implements Runnable{
    String breed;
    String hairColour;
    RunningBehaviour runningBehaviour= new FastRunningBehaviour();
    void bark() {
        System.out.println("Bow");
    }
    @Override
    void sayName() {
        System.out.println("Bow  Bow Bow saying name");
    }
   public void run() {
        runningBehaviour.run();
   }
}
