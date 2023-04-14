//create a class named "Shape" with three methods named "area", 
//In first method find the area of the rectangle, 
//second method find the area of the circle and
//third method find the area of the square.

class areaa {

  void Area(int r, int s) {
    int area = r * s;
    System.out.println("area of rectangle" + area);
  }

  void Area(double q) {  //over loading
    double area = 3.14 * q * q;
    System.out.println("area of circle is " + area);
  }

  void Area(int r) {
    int area = r * r;
    System.out.println("area of square is " + area);
  }
}

class Shape {
  public static void main(String args[]) {
    areaa obj = new areaa();
    obj.Area(5, 6);
    obj.Area(5.5554);
    obj.Area(5);
  }
}
