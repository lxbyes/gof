package me.leckie.gof.factory.factorymethod;

import me.leckie.gof.factory.model.Bus;
import me.leckie.gof.factory.model.Car;
import org.junit.BeforeClass;
import org.junit.Test;

public class BMWFactoryTests {

  private static BMWFactory bmwFactory;

  @BeforeClass
  public static void beforeClass() {
    bmwFactory = new BMWFactory();
  }

  @Test
  public void testCar() {
    bmwFactory.test(Car.class);
  }

  @Test
  public void testBus() {
    bmwFactory.test(Bus.class);
  }
}