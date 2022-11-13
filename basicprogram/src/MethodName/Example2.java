package MethodName;

public class Example2 {
	/**
	 * non-static method with access modifier as default, return type as void with not parameter/argument
	 */
	void display() {
		System.out.println("I am display method");
	}
	
	static void print(char c1) {
		//char c1='A';
		System.out.println("I am print method and printing char as: "+c1);
	}
	
	private void call(long num) {
		System.out.println("I am call method and calling number is: "+num);}
		
		public static void main(String args[]) {
			print('A');
			Example2 d1= new Example2();
			d1.display();
			Example2 e1= new Example2();
			e1.call(215479);
			
			//call(2541687);
			
	}
}
