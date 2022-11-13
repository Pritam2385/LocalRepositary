package Abstractions;
abstract class RBIBank102 {
	 abstract double getRateOfInterestForHomeLoan();
	//abstract mean must be overridden
	//final means can't be override
}
class SBI102 extends RBIBank {
	double getRateOfInterestForHomeLoan() {
		return 6.45;
	}
}
class abstractClass4 {
	public static void main(String args[]) {		
RBIBank p1=new SBI102();

System.out.println(p1.getRateOfInterestForHomeLoan());
	}
}