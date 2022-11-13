package day2.basicprogram;

public class example1 {
int age;
double salery;
	public static void main(String[] args) {
		example1 ref=new example1();
		System.out.println("age="+ref.age);
		System.out.println("salery="+ref.salery);
		System.out.println("****************");
//reintialization
		ref.age=25;
		ref.salery=20000;
		System.out.println("age="+ref.age);
		System.out.println("salery="+ref.salery);
		System.out.println("****************");
		example1 ref1=new example1();
		ref1.age=27;
		ref1.salery=40000;
		System.out.println("age="+ref1.age);
		System.out.println("salery="+ref1.salery);
		
	}

}
