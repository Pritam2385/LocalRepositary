package Infomation;

public class MethodOverloading {
	int a;
	int b;
void sum() {
	a=10;
	a=20;
	System.out.println(a+b);
}
void sum(int x,int y) {
int a=x;
int b=y;
System.out.println(a+b);
}
void sum(int x,int y,int z) {
	System.out.println(x+y+z);
}
void sum (int x,double y) {
System.out.println(x+y);
}
	public static void main(String[] args) {
		
MethodOverloading mo=new MethodOverloading();
mo.sum();
mo.sum(10,20);
mo.sum(10,20,30);
mo.sum(10,20.5);
	}

}
