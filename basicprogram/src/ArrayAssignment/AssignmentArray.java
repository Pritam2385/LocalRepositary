package ArrayAssignment;

public class AssignmentArray{
	

	 class addofArray {

		public static void main(String[] args) {
		int []ar= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<ar.length; i++) {
			sum=sum+ar[i];
		}
		System.out.println(sum);
		}
	}
	result=> 150

	package array;
	public class AscendingOrder {

		public static void main(String[] args) {
	int []arr= {10,12,15,8,5,14,3};
	int temp =0;
	System.out.println("Elements of original array are in ascending order");
	for(int i =0;i<arr.length;i++) {
		for(int j=i+1; j<arr.length;j++) {
			if (arr[i]>arr[j]) {
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.println(arr[i]);
	}
	}

	}

	result=> Elements of original array are in ascending order
	3
	5
	8
	10
	12
	14
	15


	package array;

	public class coppyElelments_1 {
	public static void main(String[] args) {
		int[]arr1= {15,25,35,45,55,65,75,85,95};
		int[]arr2= arr1;
		System.out.println("Original array is:");
		
		for(int num:arr1) {
			System.out.print(num +", ");
		}
		
		System.out.println( );
		
		
		System.out.println("copied arry is : ");
		for (int num1: arr2) {
			System.out.print(num1 +", ");
		}
	}
	}

	result=>Original array is:
	15, 25, 35, 45, 55, 65, 75, 85, 95, 
	copied arry is : 
	15, 25, 35, 45, 55, 65, 75, 85, 95, 



	package array;

	public class decendingOrder {

		public static void main(String[] args) {
			int []arr= {10,12,15,8,5,14,3};
			int temp =0;
			
			for(int i =0;i<arr.length;i++) {
				for(int j=i+1; j<arr.length;j++) {
					if (arr[i]<arr[j]) {
						temp = arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				System.out.println(arr[i]);
			}
			}

		}

	result=>
	15
	14
	12
	10
	8
	5
	3


	package array;

	public class duplicateElement {

		public static void main(String[] args) {
		int[]ar1= {1,1,1,2,5};
		for (int i=1;i<ar1.length-1;i++) {
			for (int j=i+1; j<ar1.length;j++) {
				if (ar1[i]==ar1[j]) {
					System.out.println("duplicate element is "+ ar1[j]);
				}
			}
		}

		}
	result=>

	duplicate element is 1



	package array;

	public class elementAtEvenPosition {

		public static void main(String[] args) {
			int[]ab = { 10,15,20,21,25,28,30};
			System.out.println("Elements at even position :");
			for(int i =0; i<ab.length; i=i+2) {
				System.out.print(ab[i]+" ");
			}
			
		}

	}
	result=>
	Elements at even position :
	10 20 25 30 



	package array;

	public class ElementAtoddPosition {

		public static void main(String[] args) {
			int[]ab = { 15,10,12,13,14,16};
			System.out.println();
			System.out.println("Elements at odd position :");
			for(int i =1; i<ab.length; i=i+2) {
				System.out.print(ab[i]+" ");
			}
		}

	}

	result=>
	Elements at odd position :
	10 13 16 

	package array;

	public class elementOFarray {

		public static void main(String[] args) {
		int []A= {4,5,7,8,2,3,1};
		for(int num: A) {
		System.out.print(num+" " );
		}
		}
	}
	result=>
	4 5 7 8 2 3 1 

	package array;

	public class EvenOdd {

		public static void main(String[] args) {
		int[]a = {10,12,14,15,17,18,20,22};
		
		for (int num:a) {
			if(num%2==0) {
				System.out.println("even no is :" +num );
				
			}
			else {
				System.out.println("odd no is :"+num);
			}
			}
			
		}
		}
	result=>
	even no is :10
	even no is :12
	even no is :14
	odd no is :15
	odd no is :17
	even no is :18
	even no is :20
	even no is :22


	package array;

	public class largestNO {

			public static void main(String[] args) {
				int []B= {2,4,3,7,5,9,8,12};
		int max =B[0];
		for (int i =1 ; i<B.length; i++) {
			if(B[i]> max) {
				max=B[i];
			}
		}
		System.out.println("large element is "+ max);

		}

		}
	result=>
	large element is 12

	package array;

	public class LeftRotate {

		public static void main(String[] args) {
			int[]ar1= {20,25,26,27,30,32,35};
			System.out.println(" original array");
			
			for(int num:ar1) {
			System.out.print(num  +" ");
			}
			
				System.out.println();
			
			int temp = ar1[0];
			for(int i=0;i<ar1.length-1; i++) {
				ar1[i]=ar1[i+1];
				}
			ar1[ar1.length-1]= temp;
			for(int i=0;i<ar1.length; i++) {
				
	         System.out.print(ar1[i]+ " ");
		}
		}
	}
	result=>
	 original array
	20 25 26 27 30 32 35 
	25 26 27 30 32 35 20 

	package array;

	public class remove_dupplicateElement {

		public static void main(String[] args) {
	int[]arr= { 10,15,10,12,13,12,14};
	int l = arr.length;
	for(int i=0;i<l;i++)
	System.out.print(arr[i]+" ");

	for(int i =0;i<l-1;i++) {
		for(int j=i+1;j<l;j++) {
			if(arr[i]==arr[j]) {
				arr[j]=arr[l-1];
				l--;
			}
		}
	}
	System.out.println();
	System.out.println("new array without repeatation: ");
	for(int i=0;i<l;i++)
		System.out.print(arr[i]+" ");

		}

	}
	result=>
	10 15 10 12 13 12 14 
	new array without repeatation: 
	10 15 14 12 13 


	package array;

	public class ReverseOrder {

		public static void main(String[] args) {
		int[]A = {10,20,30,40,50,60};
		for (int i =0;i<A.length;i++) {
			System.out.print(A[i]+ " ");
		}
		System.out.println();
		System.out.println("Array in reverse order");
		for(int j=A.length-1; j>=0;j--) {
			System.out.print(A[j] +" ");
		}

		}

	}
	result=>
	10 20 30 40 50 60 
	Array in reverse order
	60 50 40 30 20 10 



	package array;

	public class secondLargestNo {

		public static void main(String[] args) {
		
	int []arr = { 2,5,7,6,12,15};
	int max1=0,max2=0;
	for (int i =0;i<arr.length;i++) {
		if( arr[i]>max1) {
			max2=max1;
			max1=arr[i];
		}
		else if (arr[i]>max2  &&arr[i]!=max1) {
			max2=arr[i];
			}
		}
			System.out.println("second largest element ="+max2);
		}

	}

	result=>
	second largest element =12



	package array;

	public class SmallElementOf {

		public static void main(String[] args) {
			
				int []ar= {2,-4,3,7,5,9,8,12};
		int min =ar[0];
		for (int i =1 ; i<ar.length; i++) {
			if(ar[i]< min) {
				min=ar[i];
			}
		}
		System.out.println("Smallest element is "+ min);

		}
		}
	result=>
		Smallest element is -4



	package array;

	public class ThirdLargestElement {

		public static void main(String[] args) {
			int []arr = { 2,5,7,6,12,15};
			int max1=0,max2=0,max3=0;
			for (int i =0;i<arr.length;i++) {
				if( arr[i]>max1) {
					max3=max2;
					max2=max1;
					max1=arr[i];
				}
				else if (arr[i]> max3 && arr[i]!=max2) {
					max3=arr[i];
				}
			}
			
			System.out.println("third largest element ="+max3);

				}

	}
	result=>
	third largest element =7


	package matrix;

	public class addToMatrix {

		public static void main(String[] args) {
		int [][]a= {{10,20},{10,20}};
		int [][]b= {{1,2},{1,2}};
		int result[][]=new int [2][2];
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			result[i][j]=a[i][j]+b[i][j];
			System.out.print(result[i][j]+" ");
		}

		System.out.println();
	}
		}

	}

	result=>
	11 22 
	11 22 


	package matrix;
	public class multiOf2Matrix {
		public static void main(String[] args) {
			int [][]a= {{12,11},{12,20}};
			int [][]b= {{21,25},{11,21}};
			int result[][]=new int [2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				result[i][j]=a[i][j]*b[i][j];
				System.out.print(result[i][j]+" ");
			}

			System.out.println();
			}
			}

		}
	result=>
	252 275 
	132 420 



	package matrix;

	public class productOf2matrix {
	public static void main(String[] args) {

			
			int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
			int [][]b= {{1,2,3},{4,5,6},{7,8,9}};
			int result[][]=new int [3][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				result[i][j]=a[i][j]*b[i][j];
				System.out.print(result[i][j]+" ");
			}

			System.out.println();
		}
			}

		}
		
	result=>
	1 4 9 
	16 25 36 
	49 64 81 


	package matrix;

	public class SparseMatrix {

		public static void main(String[] args) {
			int size,row ,col,count=0;
		int [][]a= {{1,0,0},{0,1,0},{0,0,1}};
		//int [][]b= {{0,2,0},{2,0,0},{0,0,1}};
		row =a.length;
		col=a[0].length;
		size=row*col;

		for (int i=0;i<row;i++) {
			for (int j=0;j<col;j++) {
				if(a[i][j]==0)
					count++;
			}
		}
		
		if(count >(size/2)) {
			System.out.println("given matrix is sparse matrix");
		}
		else {
			System.out.println("given matrix is not sparse matrix");
		}
		
		}

	}

	result=>
	given matrix is sparse matrix

	package matrix;

	public class substractionOF2matrix {

		public static void main(String[] args) {
			int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
			int b[][]= {{9,8,7},{6,5,4},{3,2,1}};
			int c[][]=new int [3][3];
			for(int i=0;i<=2;i++) {
				for(int j=0;j<=2;j++) {
					c[i][j]=a[i][j]-b[i][j];
					System.out.print(c[i][j]+"   ");
				}
				System.out.println();
			}

		}

	}
	result=>
	1   12   23   
	34   45   56   
	67   78   89   



	package matrix;

	public class lowerTringular_Matrix {
		public static void main(String[] args) {
			int[][]arr= {{7,4,3},{5,8,3},{1,6,9}};

			for(int i=0;i<=2;i++) {
				for(int j=0;j<=2;j++) {
					System.out.print(arr[i][j] +" ");
				}
				System.out.println();
			}
			System.out.println("lower triangular matrix is:");
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if (i>=j){
						 System.out.print(arr[i][j]);
					   }else{
					      System.out.print(" ");
					}
				}
				System.out.println();
			}

			}

	}

	result=>

	7 4 3 
	5 8 3 
	1 6 9 
	lower triangular matrix is:
	7  
	58 
	169


	package matrix;

	public class transposematrix {

		public static void main(String[] args) {
			int matrix[][]= {{10,20,30},{40,50,60}};
			int row=2,column=3;
			int abc[][]=new int [2][3];
			System.out.println(" Given matrix is :");
			for(int i=0;i<row;i++) {
				for(int j = 0;j<column;j++) {
					System.out.print(matrix[i][j]+" ");
				}
					System.out.println();
				}
			System.out.println(" transpose matrix is:");
			for(int i=0;i<column;i++) {
				for(int j = 0;j<row;j++) {
					System.out.print(matrix[j][i]+" ");
				}
					System.out.println();
				}
			
			}
		}

	result=>
	10 20 30 
	40 50 60 
	 transpose matrix is:
	10 40 
	20 50 
	30 60 

	package matrix;

	public class upperTriangularMatrix {

		public static void main(String[] args) {
		int[][]arr= {{1,4,3},{4,5,6},{7,5,1}};
//		int arr1[][]=new int[3][3];
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("Upper triangular matrix is:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if (i<=j){
					 System.out.print(arr[i][j]);
				   }else{
				      System.out.print(" ");
				}
			}
			System.out.println();
		}

		}
	}
	result=>
	1 4 3 
	4 5 6 
	7 5 1 
	Upper triangular matrix is:
	143
	 56
	  1


