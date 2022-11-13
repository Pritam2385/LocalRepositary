package FinalKeyword;

	class student {
		int rollno;
		float fee;
		student(int rollno, float fee) {		
			rollno = rollno;
			fee = fee;
		}
		void display() {
			System.out.println(rollno + " " +  fee);
		}
	}
	class ThisKeyword1 {
		static int age=25;
		public static void main(String args[]) {	
			int age=30;
			System.out.println("Age: "+age);//30
			System.out.println("SGV age: "+ThisKeyword1.age);//25
			student s1 = new student(111, 5000f);
			s1.display();//111 5000.0
			student s2 = new student(112, 6000f);
			s2.display();//112 6000.0
		}
	
	}
