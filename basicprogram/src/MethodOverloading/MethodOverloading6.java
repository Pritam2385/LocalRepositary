package MethodOverloading;
public class MethodOverloading6 {
	
	void disp() {
		System.out.println("disp without param");
	}
	void disp(int a, double b) {
		System.out.println("disp with int,double="+(a+b));
	}
	void disp(double b, double c) {
		System.out.println("disp with double,double="+(b+c));
	}	
	void disp(double a, int b) {
		System.out.println("disp with doble,int="+(a-b));
	}
	public static void main(String args[]) {
		MethodOverloading6 obj = new MethodOverloading6();
	
		obj.disp();
		//obj.disp(2,5);// compile time error, not possible
		obj.disp(25.5,15.5);
		obj.disp(15.6, 3);
		obj.disp(15, 3.5);
	}
}