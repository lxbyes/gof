package me.leckie.gof.factory.factorymethod;

import me.leckie.gof.factory.model.Vehicle;

public class MercedesFactory extends AbstractVehicleFactory {

  @Override
  public <T extends Vehicle> T createVehicle(Class<T> clazz) {
    try {
      return clazz.newInstance();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
