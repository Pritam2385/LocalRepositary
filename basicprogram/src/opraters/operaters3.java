package opraters;

public class operaters3 {

		public static void main(String[] args) {
			int a = -1, b;
			b = a++ + ++a + ++a + a;//-1+0+1+-1
		
			System.out.println("a: "+a);// 
			System.out.println("b: "+b);//
			System.out.println("**********************");
			a = 7;//7+5+4+4
			b = a-- + --a + --a + a;
		
			System.out.println("a: "+a);//
			System.out.println("b: "+b);// 

			a = -21;//-22+(-23)+(-24)+(-24)+(-23)+(-23)
			b = --a + --a + --a + a + ++a + a++ + a;//
			
			System.out.println(a);// 
			System.out.println(b);// 

			a = -5;//-5-6-5-5-3-3-2
			b = a-- + a + ++a + a++ + ++a + a++ + a;
			
			System.out.println(a);//
			System.out.println(b);//
		}
	}
