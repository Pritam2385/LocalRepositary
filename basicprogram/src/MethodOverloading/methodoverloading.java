package MethodOverloading;
public class methodoverloading{

int age=25;
static char Empid='A';
double salary=35000d;

 static void show(int age){
	 this.age
System.out.println("Employee age="+age);
}

static void show(char Empid){
System.out.println("Employee Empid="+Empid);
}

static void show (double salary){
System.out.println("Employee Salary="+salary);
}

public static void main(String args[]){
methodoverloading p1=new methodoverloading();
p1.show(10);
p1.show(25000.0);
p1.show('A');
}
}
