package constructer;

public class Cons5 {
	
		int roll;
		double salary;
		Cons5(int r,double s){
			roll=r;
			salary=s;
		}
		void display() {
			System.out.println(roll + " " + salary);
		}
		public static void main(String args[]) {
			Cons5 c1 = new Cons5(101,250045.45);
			c1.display();
			Cons5 c2 = new Cons5(201,550045.45);		
			c2.display();
		
	}

	/**
	parameterized constructor: is used to initialize different values non-static variable at the time of object creation

	*/
}
