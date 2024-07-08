package FactoryDesignPattern;

import java.awt.*;

public class AndroidFlutterExecutor implements FlutterExecutor{

    @Override
    public void startApp() {

    }

    @Override
    public void printHelloWorld() {

    }

    @Override
    public AndroidButton createList() {
        return new AndroidButton();
    }

    @Override
    public FlutterExecutorUIComponentFactory getUIComponentFactory() {
        return new AndroidFlutterExecutorUIComponentFactory();
    }
}
