package Study;

public class swappingnumber {
public static void main(String args[]) {
	
	int a=30;
    int b=20;
    //using temporary variable
	System.out.println("Before swapping of two number a="+a+ " b="+b);
	int t=a;
	a=b;
	System.out.println("After  swapping of two number a="+a+ " b="+b);
	//using addition and subtraction
	a=a+b;//30+20=50
	b=a-b;//50-20=30
	a=a-b;//50-30=20
	
}
}
