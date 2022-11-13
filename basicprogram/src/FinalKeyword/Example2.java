package FinalKeyword;

public class Example2 {
	final int empId=90;
	double salary=34400.67;
	void run() {
		System.out.println("empId: "+empId);
	}
	public static void main(String args[]) {
		final int empId=25;
		
		System.out.println(empId);
		Example2 obj = new Example2();
		obj.run();
		System.out.println(obj.salary);
	}
}
