package AssignmentArray;
import java.util.*;

class ArrayListOps {

	public ArrayList<Integer> makeArrayListInt(int n) {
		ArrayList<Integer> arrList = new ArrayList<>(Collections.nCopies(n, 0));

		return arrList;
	}
   
	public ArrayList<Integer> reverseList(ArrayList<Integer> list) {
		
		ArrayList<Integer> reverse = new ArrayList<>();

		for(int i=list.size()-1; i>=0; i--) {
			reverse.add(list.get(i));
		}
		return reverse;
	}


	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n) {
		
		ArrayList<Integer> arrList = new ArrayList<>();

		Collections.replaceAll(list,m,n);

		return list;
	}
}
public class Source {
	public static void main(String[] args) {

		ArrayListOps arrList = new ArrayListOps();

		ArrayList<Integer>  ary = arrList.makeArrayListInt(4);
		System.out.println(ary);


		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(10);
		list.add(28);
		list.add(33);
		list.add(25);
		list.add(10);

		ArrayList<Integer> reverseList = arrList.reverseList(list);
		System.out.println(reverseList);

		int m = 28;
		int n = 20;
		ArrayList<Integer> changedList = arrList.changeList(list,m,n);
		System.out.println(changedList);
	}
}
