package org.example;

public class Horse extends Animal implements Runnable {
    RunningBehaviour runningBehaviour=new FastRunningBehaviour();

    public void run() {
        runningBehaviour.run();
    }
}

