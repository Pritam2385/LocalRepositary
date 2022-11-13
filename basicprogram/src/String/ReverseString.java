package String;
public class ReverseString{
public static void main(String args[]){
String p1="PRITAM";
String t1=" ";
for(int i=p1.length()-1;i>=0;i--){
t1=t1+p1.charAt(i);
}
System.out.println("MY NAME="+p1);
System.out.println("MY NAME="+t1);
}
}
