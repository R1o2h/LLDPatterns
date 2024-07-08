package FactoryDesignPattern;

import java.awt.*;

public class IOSFlutterExecutor implements FlutterExecutor{
    @Override
    public void startApp() {

    }

    @Override
    public void printHelloWorld() {

    }

    @Override
    public IOSButton createList() {
        return new IOSButton();
    }

    @Override
    public FlutterExecutorUIComponentFactory getUIComponentFactory() {
        return new IOSFlutterExecutorUIComponentFactory();
    }
}
