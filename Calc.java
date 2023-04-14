
//Create a class named "Calculator" with three methods named "add" with first method takes two parameters of int type. 
//Second add method takes 2 paramters of double type and 
//third add method takes 3 parameters of first two parameters of int and 
//third parameters of long and perform addition operation in each method.
import java.util.Scanner;

class Calculator {
  int a, b;

  void add() {
    int sum = a + b;
    System.out.println(sum);
  }

  void sub() {
    int sub = a - b;
    System.out.println(sub);

  }

  void mul() {
    int mul = a * b;
    System.out.println(mul);
  }
}

class Calc {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    Calculator c = new Calculator();
    System.out.println("enter 1st dight");
    c.a = s.nextInt();
    System.out.println("enter 2st dight");
    c.b = s.nextInt();
    c.mul();
    c.sub();
    c.add();
  }
}