package MethodOverloading;

class DisplayOverloading {
	public void disp(char c) {
		System.out.println(c);
	}
	public void disp(char c, int num) {
		System.out.println(c + " " + num);
	}
	public void disp(double c, double num) {
		System.out.println(c + " " + num);
	}
}
public class MethodOverloading5 {
	public static void main(String args[]) {
		DisplayOverloading obj = new DisplayOverloading();
		obj.disp('a');
		obj.disp('a', 10);
		obj.disp(10,25);
		MethodOverloading5 m2=new MethodOverloading5();
		m2.call(63.5);
		m2.call(123);
	}
	public void call(double d) {
		System.out.println("Calling....."+d);
	}
	public void call(int num) {
		System.out.println("Calling....."+num);
	}
}
