package constructer;


	public class ThisKeyword {
		static int age;
		int salary;//global variable
		int empId;//object created
		void display(int salary)//45000
		{
			System.out.println("Salary"+salary);//45000
			System.out.println("NSGV Salary"+this.salary);//0
			this.salary=35000;
			System.out.println("update NSGV Salary"+this.salary);//35000
		}
		public static void main(String[] args) {
			int age=25;
			System.out.println("age: "+age);//25
			System.out.println("global age:"+ThisKeyword.age);//0
			System.out.println("=======================================");
			int salary=25000;//local variable
			int empId=250;
			System.out.println("local Salary: "+salary);//25000
			System.out.println("Local EmpId: "+empId);//250
			System.out.println("=======================================");
			ThisKeyword t1=new ThisKeyword();
			System.out.println("t1: Global EmpID: "+t1.empId);//0
			System.out.println("t1: Global Salary: "+t1.salary);//0
			System.out.println("=======================================");
			t1.display(45000);
			System.out.println("=======================================");
			System.out.println("t1: Global Salary: "+t1.salary);//35000
			ThisKeyword t2=new ThisKeyword();
			System.out.println("t2: Global EmpID: "+t2.empId);//0
			System.out.println("t2: Global Salary: "+t2.salary);//35000
			System.out.println("=======================================");
			t2.display(45000);	
		}
	
	/**
	 * this keyword is a predefined keyword in JAVA
	 * this keyword is an instance of current class
	 * this keyword is used to differentiate non-static local and global variable when they have same name
	 * this keyword can be used only for non-static method
	*/
}
