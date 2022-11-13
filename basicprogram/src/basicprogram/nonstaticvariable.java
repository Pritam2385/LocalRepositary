package basicprogram;

public class nonstaticvariable {
	static int rollnumber = 21;
	static char grade = 'B';
	static boolean res = false;
	static double percentage = 64;
	int rollnumber1;
	char grade1;
	boolean res1;
	double percentage1;

	public static void main(String args[]) {
		int rollnumber2 = 23;
		char grade2 = 'D';
		boolean res2 = true;
		double percentage2 = 53.33;
		System.out.println("===================local variables==============================");
		System.out.println("roll number of student=" + rollnumber2);
		System.out.println("grade of student=" + grade2);
		System.out.println("result of student=" + res2);
		System.out.println("percentage of student=" + percentage2);
		System.out.println("=====================static global variables============================");
		System.out.println("roll number of student=" + nonstaticvariable.rollnumber);
		System.out.println("grade of student=" + nonstaticvariable.grade);
		System.out.println("result of student=" + nonstaticvariable.res);
		System.out.println("percentage of student=" + nonstaticvariable.percentage);
		System.out.println("=====================non-static global variables============================");
		nonstaticvariable p1 = new nonstaticvariable();
		System.out.println("roll number of student=" + p1.rollnumber1);
		System.out.println("grade of student=" + p1.grade1);
		System.out.println("result of student=" + p1.res1);
		System.out.println("percentage of student=" + p1.percentage1);
		System.out.println("=====================non-static global variables============================");
		p1.rollnumber1 = 22;
		p1.percentage1 = 80.73;
		p1.res1 = true;
		p1.grade1 = 'A';
		System.out.println("roll number of student=" + p1.rollnumber1);
		System.out.println("grade of student=" + p1.grade1);
		System.out.println("result of student=" + p1.res1);
		System.out.println("percentage of student=" + p1.percentage1);
	}
}
