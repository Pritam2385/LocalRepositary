package constructer;


	class B {
		int i = 10;
		B() {
			System.out.println("Running Class B constructor..");
			i = 23;
		}
	}
	public class const7 {

		public static void main(String args[]) {
			System.out.println("Main() of Class Cons5 is started...");
			B b1 = new B();
			System.out.println("Class B global varibale i = " + b1.i);//23
			System.out.println("======================================");
			B b2 = new B();
			System.out.println("Class B global varibale i = " + b2.i);//23
			System.out.println("Main() of Class Cons5 is ends here...");
		}
	

	//constructor overloading & blocks
}
