package Typecasting;
public class PrimitiveCasting4 {

	public static void main(String[] args) {
		//small to large .....> implicit widening
		byte b = 5;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		System.out.println("Examples of Widening Type casting...!!");
		System.out.println("byte to short : " + s);//5
		System.out.println("byte to int : " + i);//5
		System.out.println("byte to long : " + l);//5
		System.out.println("byte to float : " + f);//5.0
		System.out.println("byte to double : " + d);//5.0
	}
}
//implicit narrowing is not possible