package Infomation;

public class Example1 {
	int Empid;
	String EmpName;
	double salary;
	int deptNo;
	//constructor
	/*
	Example1(int id,String Name,double sal,int dept){
		//we give different name here because if we give same name then it show the error,in that case we also use the this keyword.
		Empid=id;
		EmpName=Name;
		salary=sal;
		deptNo=dept;
	}
	*/
	//method
	void setdata (int id,String Name,double sal,int dept){
		//we give different name here because if we give same name then it show the error,in that case we also use the this keyword.
		Empid=id;
		EmpName=Name;
		salary=sal;
		deptNo=dept;
	}
		
void display() {
	System.out.println("Empid="+Empid);
	System.out.println("EmpName="+EmpName);
	System.out.println("salary="+salary);
	System.out.println("deptNo="+deptNo);
	System.out.println("======================================================");
	/*there are three methods to intiliaze class variables 
	 1.by using object
	 2.by using constructor
	 3.by using method
	 */
}
public static void main(String args[]) {
	/*
	 //1. by using constructor
	Example1 emp1=new Example1(10,"kiran",25000,15);//Employee101
	emp1.display();
	*/
	//to call the constructor pass the parameter at object creation time than automatically called the  constructer
	//2. by using object(Directly)
	/*
	 Example1 emp1=new Example1();//Employee102 
	emp1.Empid=101;
	emp1.EmpName="Pritam";
	emp1.salary=20000.0;
	emp1.deptNo=10;
	emp1.display();
	
	/*
	Example1 emp2=new Example1();//Employee102
	emp2.Empid=102;
	emp2.EmpName="Kaveri";
	emp2.salary=25000.0;
	emp2.deptNo=11;
	emp2.display();
	*/
	Example1 emp1=new Example1();
	emp1.setdata(10,"kiran",25000,15);
	emp1.display();
}
}
