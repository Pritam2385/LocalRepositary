package basicprogram;
public class variables{
int age=27;
static int salary=35000;
public static void main (String args[]){
int Empid=250;
System.out.println("Local variable="+Empid);
System.out.println("Static Global Variable="+variables.salary);
variables p1=new variables();
//p1.age();
System.out.println("Non-static Global varibles="+p1.age);
}
} 