package ThisKeyword;
class test121 {
	void m() {
		System.out.println("hello m");
	}
	void n() {
		System.out.println("hello n");
		//m();//same as this.m()
		m();
	}
}
class constthis 
{
	void methodOne()
	{
		System.out.println("Inside Method ONE");
	}
	void methodTwo()
	{
		System.out.println("Inside Method TWO");
		this.methodOne();// same as calling methodOne()
		//methodOne();
	}
	public static void main(String args[]) {
		constthis  obj = new constthis();
		obj.methodTwo();
		test121 a = new test121();
		a.n();
	}
}

/**
this keyword is a predefined keyword
its a current class instance
use to access non static members
should be used only inside non-static member
ideally used to diff. non static global variable and local variable when they have same name.

*/