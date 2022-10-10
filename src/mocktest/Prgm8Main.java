package mocktest;

import java.util.Scanner;

class Candidate{
	private String name,gender;
	private double expectedSalary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getExpectedSalary() {
		return expectedSalary;
	}
	public void setExpectedSalary(double expectedSalary) {
		this.expectedSalary = expectedSalary;
	}
	
}
//custom exception
class InvalidSalaryException extends Exception{
	
	InvalidSalaryException(String str){
		super(str);
	}
	
}
public class Prgm8Main {
	
	public static Candidate getCandidateDetails() throws InvalidSalaryException{
		
		Scanner sc = new Scanner(System.in);
		Candidate candidateObj = new Candidate();
		
		System.out.println("Enter the candidate details\nName");
		String name = sc.nextLine();
		candidateObj.setName(name);
		System.out.println("Gender");
		String gender = sc.next();
		candidateObj.setGender(gender);
		System.out.println("Expected Salary");
		double expectedSalary = sc.nextDouble();
		
		if(expectedSalary<10000) 
			throw new InvalidSalaryException("Registration Failed.Salary cannot be less than 10000.");
		else 
		{
			candidateObj.setExpectedSalary(expectedSalary);
			return candidateObj;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		try 
		{
			Prgm8Main.getCandidateDetails();
			System.out.println("Registration Successful");		
		}
		catch(InvalidSalaryException ise){
			System.out.println(ise.getMessage());
		}
	

	}

}
