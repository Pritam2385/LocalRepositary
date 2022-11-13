package Typecasting;
public class PrimitiveCasting2 {

	public static void main(String[] args) {		
		int salary=30000;
		/* explicit widening*///small to large
		double salaryDouble=(double)salary;
		float salaryFloat=(float)salary;
		System.out.println("*********** explicit widening ***********");
		System.out.println("salary: "+salary+"\nsalaryDouble: "+salaryDouble+"\nsalaryFloat :"+salaryFloat);
		//30000 30000.0 30000.0
		System.out.println("*********** implicit widening ***********");
		/* implicit widening or auto-widening*/
		double salaryDouble2=salary;
		float salaryFloat2=salary;
		System.out.println("salary: "+salary+"\nsalaryDouble2: "+salaryDouble2+"\nsalaryFloat2 :"+salaryFloat2);
		//30000 30000.0 30000.0
		double salaryDb=30000.35d;
		/*explicit narrowing*///large to small
		int salaryInt=(int)salaryDb;//30000
		float salartFt=(float)salaryDb;//30000.35
		//access =declare
		System.out.println("*********** explicit narrowing ***********");
		System.out.println("salaryDb: "+salaryDb+"\nsalaryInt: "+salaryInt+"\nsalartFt :"+salartFt);
		//30000.35 30000 30000.35
		/*implicit narrowing not possible*/
//		int salaryInt2=salaryDb;
//		float salartFt2=salaryDb;
		}
}