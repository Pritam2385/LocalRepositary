package Infomation;

public class methods {
	int a;
	int b;
	//method may not take parameters
	/*void sum() {
		System.out.println(a+b);
	}
	*/
	//methods take parameters
	/*void sum(int x,int y) {
		a=x;
		b=y;
		System.out.println(a+b);
	}
	*/
	//method returns some value
	
	int sum(){
		return(a+b);
	}
	
	
public static void main(String args[]) {
methods s1=new methods();
s1.a=100;
s1.b=200;
int a=s1.sum();
System.out.println(a);

}
}