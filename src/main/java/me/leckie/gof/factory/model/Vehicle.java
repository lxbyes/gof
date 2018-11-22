package me.leckie.gof.factory.model;

public interface Vehicle {

  default void introduce() {
    System.out.println("This is a " + getClass().getSimpleName().toLowerCase() + " vehicle.");
  }
}
