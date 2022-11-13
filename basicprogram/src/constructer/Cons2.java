package constructer;

public class Cons2 {

		Cons2() {
			System.out.println("This is a zero-para constructor");
		}
		public Cons2(char c) {
			System.out.println("This is a single-para constructor");
		}
		Cons2(int num1, int num2) {
			System.out.println("This is a int-int parameterized constructor");
		}	
		Cons2(double num1, int num2) {
			System.out.println("This is a double-int parameterized constructor");
		}
		Cons2(int num1, double num2) {
			System.out.println("This is a int-double parameterized constructor");
		}
		public static void main(String[] args) {
			Cons2 c1 = new Cons2();
			Cons2 c2 = new Cons2(10, 20);
			Cons2 c3 = new Cons2('d');
			Cons2 c4 = new Cons2(10d, 20);
			Cons2 c5 = new Cons2(10, 20.45);
		
	}
	/**
	 * Constructor Overloading: more than on constructor in a class 
	 * Rule: 1. type of args differ or 
	 * 		 2. number of args differ or 
	 * 		 3. position of args differ
	 * 
	 */
}
