package me.leckie.gof.factory.factorymethod;

import me.leckie.gof.factory.model.Vehicle;

public abstract class AbstractVehicleFactory {

  // test vehicle features
  public void test(Class<? extends Vehicle> clazz) {
    System.out.println(getClass().getSimpleName() + " test their vehicle...");
    createVehicle(clazz).introduce();
  }

  public abstract <T extends Vehicle> T createVehicle(Class<T> clazz);

}
