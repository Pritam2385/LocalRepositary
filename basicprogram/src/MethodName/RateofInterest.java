package MethodName;

public class RateofInterest {
	
		
		/**
		 * simple interest: roi = (p*r*t)/100;
		 * @param args
		 */
		static double getROI() {
			int p=55000, t=2;
			float r=5.5f;
			double roi=(p*r*t)/100;
			System.out.println("Principle amount is: "+p);
			System.out.println("Duration is: "+t);
			System.out.println("Interest paid by you: "+roi);
			return roi;
		}
		static double getROI(int p,int t,float r) {
			double roi=(p*r*t)/100;
			System.out.println("Principle amount is: "+p);
			System.out.println("Duration is: "+t);
			System.out.println("Interest paid by you: "+roi);
			return roi;
			}
			public static void main(String []args) {
				getROI();
				getROI(45000,2,2.5f);
			}
		}
	
