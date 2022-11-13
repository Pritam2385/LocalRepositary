package basicprogram;
import java.util.Scanner;

class CompanyJobRepository {
	static String getJobPrediction(int age, String highestQualification) throws NotEligibleException
	{
		if(age<19)
			throw new NotEligibleException("You are underage for any job");
		else if(age>=21&&highestQualification.equals("B.E"))
			{
				return "We have openings for junior developer";
			}
		else if(age>=26&&(highestQualification.equals("M.S")||highestQualification.equals("PhD")))
		{
			return "We have openings for senior developer";
		}
		else if(age>=19&&(!(highestQualification.equals("B.E")||highestQualification.equals("M.S")||highestQualification.equals("PhD"))))
		{
			throw new NotEligibleException("We do not have any job that matches your qualifications");
		}
		return "Sorry we have no openings for now";
	}
}
public class Source {
	String searchForJob(int age, String highestQualification) throws NotEligibleException
	{
		String s= "";
		if(age>=200||age<=0)
		{
			throw new NotEligibleException("The age entered is not typical for a human being");
		}
		else
		{
			s=CompanyJobRepository.getJobPrediction( age, highestQualification);
		}
		return s;
	}
	
	public static void main(String args[] ) throws NotEligibleException 
	{
	/* Enter your code here. Read input from STDIN. Print output to 
	STDOUT */
	Scanner sc = new Scanner(System.in);	
	//System.out.println("Enter highestQualification");
	String highestQualification = sc.nextLine();
	//System.out.println("Enter age");
	int age = sc.nextInt();
	//CompanyJobRepository cj = new CompanyJobRepository();
	//cj.getJobPrediction(int age, String highestQualification);
	Source s = new Source();
	//s.searchForJob(age,highestQualification);
	System.out.println(s.searchForJob(age,highestQualification));
}
}
class NotEligibleException extends Exception {
NotEligibleException(String msg)
{
super(msg);
}
}