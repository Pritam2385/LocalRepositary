package AssignmentArray;

public class frequency {
public static void main (String args[]) {
	int[] age= {10,25,10,30,10,25,10,20,10,30,45};
	int[]freq=new int[age.length];
	int visited=-1;
	for (int i=0;i<age.length;i++) {
			int count=1;
	for (int j=0;j<age.length;j++) {
	if(age [i]==age[j]) {
		count++;
		freq[j]=visited;
	}
	}	
	if(freq[i]!=visited) {
		freq[i]=count;
	}
	}
	System.out.println("****************************");
	for(int i=0;i<freq.length;i++) {
		if(freq[i]!=visited) {
			System.out.println(age[i]+" : "+freq[i]);
		}
	}
}
}
