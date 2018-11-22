package me.leckie.gof.factory.simplefactory;

import java.util.Objects;
import me.leckie.gof.factory.model.Bus;
import me.leckie.gof.factory.model.Car;
import me.leckie.gof.factory.model.Vehicle;

public class SimpleVehicleFactory {

  public Vehicle createVehicle(String type) {
    if (Objects.equals(type, "bus")) {
      return new Bus();
    }
    if (Objects.equals(type, "car")) {
      return new Car();
    }
    return new Vehicle() {
    };
  }

}
