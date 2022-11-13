package basicprogram;
class itsConst{
itsConst(){
this(52.34);
System.out.println("Const1=");
}
itsConst(double d){
this(5205);
System.out.println("Const2="+d);
}
itsConst(int x){
System.out.println("Const1="+x);
}
 public class AllinOne{
int age=27;
int Empid=1002;
static int rollno =45;
 void show(int a,int b){
System.out.println("Method 1 calling");
}
void show (int c,double d){
System.out.println("Method 2 calling");
}
public static void main(String args[]){
int Empid=1001;
int RollNo=50;
System.out.println("Calling local RollNo="+RollNo);
System.out.println("Calling local Age="+Empid);
System.out.println("Caling Static RollNo="+AllinOne.rollno);
System.out.println("Caling Static RollNo="+this.Empid);

AllinOne p1=new AllinOne();
System.out.println("Calling Non static Age"+p1.age);
p1.show(10,20);
p1.show(20,20.5);

itsConst p2=new itsConst();
itsConst p3=new itsConst(52.34);
itsConst p4=new itsConst(25);
}
}
}