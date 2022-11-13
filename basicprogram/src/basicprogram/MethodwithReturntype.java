package basicprogram;
public class MethodwithReturntype{
static int x=10,y=20,z=30;
public static void main (String args[]){
System.out.println("X="+x);
System.out.println("Y="+y);
System.out.println("Z="+z);
System.out.println("The average value is="+avarage(z,y,x));
System.out.println("The average value is="+avarage(25,30,35));
System.out.println("The average value is="+avarage (45,35,15));
System.out.println("The average value is="+avarage (35,45,55));
int a=10,b=15,c=25;
double avg=avarage(a,b,c);
double result=avg+100;
System.out.println("Final Number="+result);

}
public static double avarage(double p,double q,double r){
return(p+q+r)/3;
}
}


