package basicprogram;

class SupertoClass{
void superClassMethod(){
System.out.println("Super_class_Method");
}
}
class Subtoclass extends SupertoClass{
//@override
void superClassMethod(){
System.out.println("Super_class_Method_is_overridien");
}
}
public class DynamicPolymorphism{
public static void main(String args[]){
SupertoClass p1=new SupertoClass();
p1.superClassMethod();
//output:Super_class_Method
p1=new SubtoClass();
p1.superClassMethod();
//output:Super_Class_Method_is_Overridden
}
}