package constructer;

public class Const8 {
	
		int age;
		double salary;
		Const8() {
			System.out.println("**********User Defined Zero-Param Constructor, start from here****************");
			age=25;
			salary=32506.56;
			System.out.println("**********User Defined Zero-Param Constructor, ends here****************");
		}
		public static void main(String[] args) {
			Const8 c1 = new Const8();
			System.out.println(c1.age);// 25
			System.out.println(c1.salary);//32506.56
		}
	}

	/**
	as we learn, constructor is used to initialize non-static members of the class hence here we can 
	see age variable value is getting initialize by constructor
	*/

