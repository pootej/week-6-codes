//Write an abstract class "Shape" which has a method "calculateArea()"
//which returns the area of the shape.
//Write two subclasses "Circle" and "Rectangle"
//which implement the method "calculateArea()" for their respective shapes.

abstract class Shape{
  abstract double CalculateArea();
  }

  class Circle extends Shape{
 double r;
  
Circle(double r){
    this.r=r;
  }
  
  double CalculateArea(){
    return 3.14*r*r;
    }
}

class Rectangle extends Shape{
  private int l,b;

 Rectangle(int l,int b){
    this.l=l;
    this.b=b;
  }
  double CalculateArea(){
    return l*b;
  }
  }


class Shaper{
  public static void main(String args[]){
    Shape s=new Circle(6);
    Shape t=new Rectangle(6,6);
    System.out.println(s.CalculateArea());
    System.out.println(t.CalculateArea());  
  }
}
