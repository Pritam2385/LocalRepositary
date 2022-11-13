package opraters;

public class opretars {

	public static void main(String[] args) {
		int a=0,b;
		b=a++ + ++a + ++a + a; //3
		System.out.println(a);//0
		System.out.println(b);//4
		System.out.println("****************************");
		 a=0;
		 b=a-- +--a +--a + a;//-5
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println("****************************");
		 a=0;
		 b=--a +--a + --a + a + ++a + ++a; //-2
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println("****************************");
		 a=0;
		 b=a-- + a + ++a + a++ + ++a + a++ +a;//3
		 System.out.println(a);
		 System.out.println(b);
	}

}
