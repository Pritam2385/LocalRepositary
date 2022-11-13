package basicprogram;
public class staticPolymorphism{
int i;
String s;
//constructer overloadig
public staticPolymorphism(){

this.i=1;
this.s="";
}
public staticPolymorphism(int i,String s){
this.i=i;
this.s=s;
}
//MethodOverloading
void anyMethod(int i){
 System.out.println(s+this.s);
//Here,'+'is used to add two numbers
}
void anyMethod(String S){
System.out.println(s+this.s);
//Here +is used to concatenate two strings
}
}