package mocktest;

import java.util.Scanner;

class Division{
	public String divideTwoNumbers(int number1,int number2) {
		String str = "";
		try {
			if(number2 == 0)
				throw new ArithmeticException();
			else
				str += "The answer is "+(number1/number2)+".";
		}
		catch(ArithmeticException ae) {
			str += "Division by zero is not possible." ;
		}
		finally {
			str += "Thank you for using the application.";
		}
		return str;
	}
}
public class prgm7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Division d = new Division();
		System.out.println("Enter the numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = d.divideTwoNumbers(a,b);
		System.out.println(s);

	}

}
