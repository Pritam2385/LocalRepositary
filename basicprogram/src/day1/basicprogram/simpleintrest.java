package day1.basicprogram;

public class simpleintrest {

	public static void main(String[] args) {
		int finalamount,intialprinciplebalance,time,P,t;
		float annualinterestrate,simpleinterest,r,A;
		P=40000;
		t=2;
		r=7.8f;
		A=P*(1+(r*t));
		simpleinterest=A;
		System.out.println("A=Final Amount");
		System.out.println("P=IntialPrincipal Balance");
		System.out.println("r=annual interest rate");
		System.out.println("t=time");
		System.out.println("P="+P);
		System.out.println("r="+r);
		System.out.println("t="+t);
		System.out.println("Simple Interest="+A);
		
		
	}

}
