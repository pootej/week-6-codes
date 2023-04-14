class Employ {
  private int id;
  private String name;
  double hr, da;

  void setid(int id) {
    this.id = id;
  }

  void setname(String name) {
    this.name = name;
  }

  void sethr(double hr) {
    this.hr = hr;
  }

  void setda(double da) {
    this.da = da;
  }

  int getid() {
    return this.id;
  }

  String getname() {
    return this.name;
  }

  Double gethr() {
    return this.hr;
  }

  Double getda() {
    return this.da;
  }
}


class Accountant extends Employ {
  private String dept;
  private int salary;

    void setdept(String dept) {
    this.dept =dept;
  }

  void setsalary(int salary) {
    this.salary =salary;
  }
   String getdept() {
    return this.dept;
  }
   int getsalary() {
    return this.salary;
  }
}

class manager extends Employ{
 private String type;
  private int salary;

  void settype(String type){
    this.type=type;
  }
  void setsalary(int salary){
    this.salary=salary;
  }

  String gettype(){
   return this.type;
    }
  int getint(){
    return this.salary;
  }
}
