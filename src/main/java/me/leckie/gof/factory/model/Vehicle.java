package me.leckie.gof.factory.model;

public interface Vehicle {

  default void introduce() {
    start();
    run();
    stop();
  }

  default void start() {
    System.out.println("Your " + getClass().getSimpleName().toLowerCase() + " start...");
  }

  default void run() {
    System.out.println("Your " + getClass().getSimpleName().toLowerCase() + " is running...");
  }

  default void stop() {
    System.out.println("Your " + getClass().getSimpleName().toLowerCase() + " stop...");
  }

}
