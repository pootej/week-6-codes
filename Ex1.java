import java.util.*;
interface Operation{
  void add();
  void sub();
  }
interface SubOpe{
  void div();
  void mul();
}

 class calulator implements Operation,SubOpe{
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  int  b=sc.nextInt();
  
 public  void add(){
System.out.println(a+b);
  }

   public  void sub(){
System.out.println(a-b);
  }
   public  void mul(){
System.out.println(a-b);
  }
    public  void div(){
System.out.println(a/b);
  }
  }
class Ex1{
  public static void main (String args[]){
    calulator o=new calulator();
	
    o.add();
    o.sub();
    o.mul();
    o.div();
    
  }
}