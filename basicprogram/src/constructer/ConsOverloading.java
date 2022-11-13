package constructer;
class ConsOverloading0{
	
	ConsOverloading0() {
		System.out.print("Zero Parameterized Constructor");
		System.out.println(" having no parameters");
	}
	ConsOverloading0(int a) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having int parameters");
	}
	ConsOverloading0(double b) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having double parameters");
	}
	ConsOverloading0(int a, double b, int c) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having int,double,int parameters");
	}	
	ConsOverloading0(double a, int b, int c) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having double,int,int parameters");
	}
	public static void main(String args[]) {
		ConsOverloading0 pc5 = new ConsOverloading0();

		ConsOverloading0 pc1 = new ConsOverloading0(12);
		ConsOverloading0 pc2 = new ConsOverloading0(13.34);
		ConsOverloading0 pc3 = new ConsOverloading0(10,13.34,45);
		ConsOverloading0 pc4 = new ConsOverloading0(13.34,23,87);
		
	}
}

/**
 * Constructor Overloading: more than on constructor in a  class
 * Rule: 
 * 1. type of args differ or
 * 2. number of args differ or
 * 3. position of args differ
 * 
 */
