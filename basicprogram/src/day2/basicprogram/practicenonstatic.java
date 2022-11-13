package day2.basicprogram;

public class practicenonstatic {
	int age;
	boolean res;
	char grade;
	float roi;
	double salery;
	//practicenonstatic=practicenonstatic ref=new practicenonstatic ();
	//classname ref=ref1
	//classname ref1=ref2
	
	public static void main(String[] args) {
		practicenonstatic ref1;// object declaration
		ref1=new practicenonstatic ();//
		//or
		//practicenonstatic ref1=new practicenonstatic ();
		System.out.println("Program starts");
		System.out.println("age="+ref1.age);
		System.out.println("res="+ref1.res);
		System.out.println("grade="+ref1.grade);
		System.out.println("roi="+ref1.roi);
		System.out.println("salery="+ref1.salery);
		System.out.println("*********************");
		//reintilization
	    ref1.age=25;
		ref1.res=true;
		ref1.grade='c';
		ref1.roi=3.14f;
		ref1.salery=400000;
		System.out.println("updated, Non-static variable age="+ref1.age);
		System.out.println("updated, Non-static variable res="+ref1.res);
		System.out.println("updated, Non-static variable grade="+ref1.grade);
		System.out.println("updated, Non-static variable roi="+ref1.roi);
		System.out.println("updated, Non-static variable salery="+ref1.salery);
		System.out.println("*********************");
		
		System.out.println("Program ends");

	}

}
