package basicprogram;
class SuperClass{
String superClassField="Super_Class_Field";

void superClassMethod(){
System.out.println("Super_Class_Field");
}
}

class Subclass extends SuperClass{
String subClassField="Sub_Class_Field";

void subClassMethod(){
System.out.println("Sub_Class_Field");
}
}

public class JavaOOPConcepts{
public static void main(String[]args){
Subclass sc1=new Subclass();
sc1.subClassMethod();
System.out.println(sc1.subClassField);
//SuperClass properties are inherited to Subclass
sc1.superClassMethod();
System.out.println(sc1.superClassField);
}
}
