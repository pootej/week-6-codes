// use of this key word
//encapsulation
import java.util.Scanner;

class Employy {
  private int id;
  private String name;
  private int salary;

  void setid(int id) {
    this.id = id;
  }

  void setname(String name) {
    this.name = name;
  }

  void setsalary(int salary) {
    this.salary = salary;
  }

  int getid() {
    return this.id;
  }

  String getname() {
    return this.name;
  }

  int getsalary() {
    return this.salary;
  }
}

class Employ {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Employy St[] = new Employy[2];
    for (int i = 0; i < St.length; i++) {
      St[i] = new Employy();

      System.out.println("Enter " + i + " information ");
      System.out.print("enter id :");
      int id = sc.nextInt();
      St[i].setid(id);
      System.out.println("enter name :");
      String name = sc.next();
      St[i].setname(name);
      System.out.println("enter salary :");
      int salary = sc.nextInt();
      St[i].setsalary(salary);

    }

  }
}
