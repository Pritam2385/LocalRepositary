package Assignment1;
public class Palindrome{
public static void main(String[]args){
String p1="pritam";
String t1="";
for(int i=p1.length()-1;i>=0;i--){
t1=t1+p1.charAt(i);
}
if(t1.equals(p1)){
System.out.println("string is palindrrone="+p1);
}
else{
System.out.println("string is  not palindrrone="+p1);
}
}
}
