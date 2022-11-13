package Assignment1;
//swapping of variables
public class Example5 {

	public static void main(String[] args) {
		float first=1.25f, second=2.3f;
		System.out.println("................Before Swap...............");
		System.out.println("First Number="+first);
		System.out.println("Second Number="+second);
		//value of first is assigned to temporary
		float temporary=first;
		//value of second is assigned to first
		first=second;
		second=temporary;
		//value of temporary (which contains the intial value of first) is assigned to second=temporary;
		System.out.println("................After Swap...............");
		System.out.println("First Number="+first);
		System.out.println("Second Number="+second);
	}

}
