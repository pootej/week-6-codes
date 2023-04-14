//Define a superclass called Shape with a method called getArea() that returns 0. 
//Define two subclasses, Circle and Rectangle,
//that extend Shape and override the getArea() 
//method to calculate and return the area of their respective shapes.
//In the main method, create instances of both Circle and Rectangle 
//and call their getArea() methods.

class Shape {

  double getarea() {
    return 0.0;
  }

}

class Circle extends Shape {

  double getarea() {
    int r = 5;
    double area = 3.18 * r * r;
    return area;

  }
}

class Rectangle extends Shape {

  double getarea() {
    int r = 5, l = 7;
    double area = l * r;
    return area;
  }
}

class ShapeOR {
  public static void main(String args[]) {
    Circle c = new Circle();

    Rectangle r = new Rectangle();

    System.out.println();
    double resulta, resultb;
    resulta = c.getarea();
    resultb = r.getarea();
    System.out.println(resulta + " :is area of circle" + resultb + " :is area of reactangle");

  }
}