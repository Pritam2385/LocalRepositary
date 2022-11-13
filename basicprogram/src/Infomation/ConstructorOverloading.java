package Infomation;

public class ConstructorOverloading {

	int a=0;
	int b=0;
	double c=0;
	 ConstructorOverloading(int x,int y)//default constructor
	 {
		 a=10;
		 b=20;
		 c=20.5;
	 }
	 ConstructorOverloading(){
		 a=40;
		 b=50; 
		 int sum;
		 sum=a+b;
		 System.out.println(+sum);
		 System.out.println("=============================================================");
	 }
	 ConstructorOverloading(int x,double y){
		 a=x;
		 c=y; 
	 }
	 ConstructorOverloading(int x,int y,double z){
		 a=x;
		 b=y;
		 c=z;
		 double multiplication=a*b;
		 System.out.println(+multiplication);
	 }
	 void display(){
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 
		 
		 
	 }
	public static void main(String[] args) {
		//ConstructorOverloading co=new ConstructorOverloading(); call first constructer i.e Default Constructor
		//co.display();
		//ConstructorOverloading co=new ConstructorOverloading(10,20); //call second constructer i.e  op:10 20 0.0
		//co.display();
		ConstructorOverloading co=new ConstructorOverloading(); //call third constructer i.e op: 10 0 20.5
		co.display();
		//ConstructorOverloading c1=new ConstructorOverloading(10,20,20.5); //call fourth constructer i.e op: 10 20 20.5
		//c1.display();
		
	}

}
