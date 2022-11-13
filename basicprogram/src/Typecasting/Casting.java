package Typecasting;
class grandparent100{
	void myfarm() {
		System.out.println("Grandfathers farm");
	}
}
class Parent100 extends grandparent100{
	long Rollnumber;

	void myHome() {
		System.out.println("Parent home");
	}
}
class Child100 extends Parent100{
	void myCar() {
		System.out.println("Child car");
	}
}
public class Casting {
	public static void main(String[] args) {
		Child100 c2=new Child100();
		c2.myCar();
		c2.myHome();
		Parent100 c1=new Parent100();		
		c1.myHome();
		System.out.println("***************Using Upcasting****************");
		//using casting concept
		Child100 i0=new Child100();
		i0.myCar();
		i0.myHome();
		i0.myfarm();
		Parent100 i1=new Child100();
		i1.myfarm();
		i1.myHome();
		Parent100 p6=new Child100();
		p6.Rollnumber=868854;
		p6.myfarm();
		p6.myHome();
		Child100 p7=(Child100)new Child100();
		//p7.Rollnumber();
		//Parent100 i2=(Parent100)i1;
		//i2.myfarm();
		//i2.myHome();
		grandparent100 i3=new Child100();
		grandparent100 i4=(grandparent100)i3;
		i4.myfarm();
		Parent100 i5=(Parent100)new Child100();
		i5.myfarm();
		i5.myfarm();
		grandparent100 i6= new Parent100();
		grandparent100 i7=(grandparent100)new Parent100();
		i7.myfarm();
	
		/*
		 * 
		//Parent100 i1=i0;//implicit upcasting
		//i0=new Child100();
		i1.myHome();
		i1.myfarm();
		Parent100 
	     grandparent100 p1=new Child100();
		grandparent100 p2=p1;
		p2.myfarm();
		grandparent100 p3=new Parent100();
		grandparent100 p=p3;
		*/
		Child100 c3=new Child100();
		c3.myCar();
		c3.myHome();
		Parent100 c4=c3;//implicit/auto upcasting --->Parent100 c4= c3 = new Child100();
		c4.myHome();
		
		Parent100 p2=new Child100();//implicit/auto upcasting
		
		Parent100 p3=(Parent100)new Child100();//explicit up-casting
		
		Parent100 p4=(Parent100)c3;//explicit up-casting
	}
}