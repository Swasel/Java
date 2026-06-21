abstract class Vehicle {
  abstract void start();

  abstract void stop();
}

abstract class Car extends Vehicle {
  void start() {
    System.out.println("Car Started");
  }
}

class SportsCar extends Car {
  void stop() {
    System.out.println("Sports Car Stopped");
  }
}

public class AbstractDemo {
  public static void main(String[] args) {
    SportsCar s = new SportsCar();

    s.start();
    s.stop();
  }
}