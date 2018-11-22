package me.leckie.gof.factory.simplefactory;

import me.leckie.gof.factory.model.Vehicle;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleVehicleFactoryTests {

  private static SimpleVehicleFactory simpleVehicleFactory;

  @BeforeClass
  public static void beforeClass() {
    simpleVehicleFactory = new SimpleVehicleFactory();
  }

  @Test
  public void createVehicle() {
    Vehicle vehicle = simpleVehicleFactory.createVehicle(null);
    vehicle.introduce();
  }

  @Test
  public void createCar() {
    Vehicle vehicle = simpleVehicleFactory.createVehicle("car");
    vehicle.introduce();
  }

  @Test
  public void createBus() {
    Vehicle vehicle = simpleVehicleFactory.createVehicle("bus");
    vehicle.introduce();
  }

}
