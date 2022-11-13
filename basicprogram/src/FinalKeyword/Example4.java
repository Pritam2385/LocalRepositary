package FinalKeyword;

public class Example4 {
	final int speedlimit;// blank final variable
	Example4() {
		//speedlimit = 70;
		speedlimit=40;
		System.out.println(speedlimit);
	}
	public static void main(String args[]) {
		Example4 f1=new Example4();
		System.out.println(f1.speedlimit);
		Example4 f2=new Example4();
		System.out.println(f2.speedlimit);
	}


/**
Any variable which is declared as final should be initialize at the same time.
but for Non static global final variable can declared and initialize inside the constructor body
*/
}
