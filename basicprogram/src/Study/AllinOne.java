package Study;
class  classone{
	int age=20;
	static  int empId=40;
	 void show(){
		 int age=25;
		 int empId=50;
	System.out.println("local age="+age);
	System.out.println("Global Age="+this.age);
	System.out.println("Local EmpId="+empId);
	System.out.println("Global EmpId="+classone.empId);
	 }			 
	 void display() {
		 System.out.println("Hello");
		this.show();
	 }
}
	 class classtwo{
		 int rollno;
		 char grade;
		 classtwo(int rollno,char grade) {
			 this(rollno);
			 this.rollno=rollno;
			 System.out.println("i am constr rollno="+rollno);
			 System.out.println("i am constr grade="+grade); 
		 }
		 classtwo(int rollno){
			
				this.grade=grade;
				
			}
		 void display2() {
			 System.out.println(rollno+" "+grade);
			
		 }
	}
public class AllinOne {
//static vs Non static
	int a=10;
	static int b=20;
	public static void main (String args[]) {
		System.out.println("Static Number="+AllinOne.b);
		AllinOne p1=new AllinOne();
		System.out.println("Non Static Number="+p1.a);
		System.out.println("================================================");
		classone p2=new classone();
		p2.display();
		System.out.println("================================================");
		classtwo p3=new classtwo(22,'c');
		p3.display2();
		classtwo p4=new classtwo(22);
		p4.display2();
	}
}


