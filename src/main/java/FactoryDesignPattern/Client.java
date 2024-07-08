package FactoryDesignPattern;

public class Client {
    public static void main(String[] args) {
        FlutterExecutor flutterExecutor = FlutterExecutorFactory
                .createExecutorBasedOnPlatform(Platforms.ANDROID);

        Button b= flutterExecutor.getUIComponentFactory().createButton();
    }
}
