package ThisKeyword;

public class Example1 {
	int x;
	// Constructor with a parameter
	public Example1(int x) {
		this.x = x;
	}

	// Call the constructor
	public static void main(String[] args) {
		Example1 myObj = new Example1(5);
		System.out.println("Value of x = " + myObj.x);//
	}
}
