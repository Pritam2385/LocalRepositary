package loops;

public class whileloop {
	public static void main(String args[]) {
		int i = 0;
		System.out.println("Printing numbers from 0 to 4");
		/*
		 * while (Boolean Condition) 
		 * { 
		 * 	
		 * }
		 */
		while (i < 5) {
			System.out.println("Hello " + i);
			i++;
		}
		
		int a=5;
		while(a>0) {
			System.out.println("bye " + a);
			a--;
		}
		char c1 = 'a';
		while (c1 <= 'z') {
			System.out.print(c1 + " ");
			c1++;
		}
		System.out.println("\n***Reverse***");
		char c2 = 'z';
		while (c2 >= 'a') {
			System.out.print(c2 + " ");
			c2--;
		}
	}

}
