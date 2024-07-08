package FactoryDesignPattern;

public class FlutterExecutorFactory {
      public static FlutterExecutor createExecutorBasedOnPlatform(Platforms platforms) {
          switch (platforms) {
              case ANDROID-> {
                  return new AndroidFlutterExecutor();
              }
              case IOS -> {
                  return new IOSFlutterExecutor();
              }
          }
          return null;
      }
}
