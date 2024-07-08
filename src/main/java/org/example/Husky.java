package org.example;

public class Husky extends Dog{
    RunningBehaviour runningBehaviour= new slowRunningBehaviour();
    public void run() {
       // System.out.println("Husky is Running");
        runningBehaviour.run();
    }
}
