//Write an abstract class "Vehicle" with an abstract method "start()"
//which will be implemented by its two subclasses "Car" and "Bike".
//Implement these classes and demonstrate how they start.

abstract class Vechilee{
 abstract void start();
}
 class Car extends Vechilee{
  void start(){
    System.out.println("smooth");
  }
}
 class Bike extends Vechilee{
  void start(){
    System.out.println("vroom");
  }
}

public class Vechile{
  public static void main(String args[]){
    Vechilee Car=new Car();
    Vechilee Bike=new Bike();
    Car.start();
    Bike.start();
  }
}
