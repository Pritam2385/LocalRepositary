package Typecasting;
public class PrimitiveCasting1 {

	public static void main(String[] args) {
		
		int myInt = 9;//small to large
		float myDouble = myInt;//widening implicit, when java compiler writes behalf of you--> double myDouble =(double)myInt;
		double d=(double)myInt;//explicit widening
		System.out.println(myInt); //9
		System.out.println(myDouble); //9.0
		System.out.println(d);//9.0

		double salary=23400.67856856898989545d;	//large to small	
		int sal=(int)salary;//narrowing,explicit
		long f=(long)salary;//narrowing,explicit
		float f1=(float)salary;//narrowing,explicit
		System.out.println("Actual Salary: "+salary);//23400.67856856898989545
		System.out.println("Int Salary: "+sal);//23400
		System.out.println("long Salary: "+f);//23400
		System.out.println("float Salary: "+f1);//23400.678(upto 7 decimal)
	}

}