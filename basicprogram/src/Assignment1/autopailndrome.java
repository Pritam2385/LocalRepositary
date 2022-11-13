package Assignment1;
import java.util.*;
public class autopailndrome{
	
public static void main(String args[]){
	

Scanner scn=new Scanner(System.in);
System.out.println("Enter string to be palindrome");
String s2=scn.next();
//System.out.println("String is in palindrone =");
palinString(s2);
}

 static void palinString(String str){
       String s1 = str;
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		if (temp.equals(s1)) {
			System.out.println("Given string is a palindrome..." );
		} else {
			System.out.println("Given string is not a palindrome..." );
		}
 }
}


