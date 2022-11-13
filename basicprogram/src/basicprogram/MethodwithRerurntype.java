package basicprogram;
public class MethodwithRerurntype{
	 /*public static void addition(){
	int A=25;
	int B=20;
	int Result=A+B;
	System.out.println("Addition="+Result);
	}
	public static void subtraction(){
	int A=25;
	int B=20;
	int Result=A-B;
	System.out.println("Subtraction="+Result);
	}
	public static void main(String args[]){
	addition();
	subtraction();
	}
}
	/*
	static double getROI() {
		int p=55000, t=2;
		float r=5.5f;
		double roi=(p*r*t)/100;
		System.out.println("Principle amount is: "+p);
		System.out.println("Duration is: "+t);
		System.out.println("Interest paid by you: "+roi);
		return roi;
	}
	static double getROI(int p,int t,float r) {
		double roi=(p*r*t)/100;
		System.out.println("Principle amount is: "+p);
		System.out.println("Duration is: "+t);
		System.out.println("Interest paid by you: "+roi);
		return roi;
	}
}*/
public class overloading{
public static void square(int a,int b){
System.out.println("I am int int method");
}
public static void square(int a,double b){
System.out.println("I am int double method");
}
public static void square(double a,double b){
System.out.println("I am int double method");
}
public static void main(String args){
square(25,35.36);
square(15.20)'
}
}

