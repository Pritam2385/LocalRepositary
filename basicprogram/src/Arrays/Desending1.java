package Arrays;

public class Desending1 {
	public static void main (String args[]) {
int[] numbers= {20, 30, 27, 85, 10, 70, 45};
int temp=0;
System.out.println("Elements of original array:");
for(int i=0;i<numbers.length;i++) {
System.out.println(numbers[i]+"");
}
for(int i=0;i<numbers.length;i++) {
	for(int j=i+1;j<numbers.length;j++) {
		if(numbers[i]<numbers[j]) {
			temp=numbers[i];
			numbers[i]=numbers[j];
			numbers[j]=temp;
		}
	}
	
}
		

}
}


