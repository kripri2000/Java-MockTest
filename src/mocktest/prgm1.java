package mocktest;
import java.util.Scanner;

public class prgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of liters to fill the tank");
		float n = sc.nextFloat();
		if(n<0)
		{
			System.out.println((int)n+" is an Invalid Input");
			System.exit(0);
		}
		System.out.println("Enter the distance covered");
		float d = sc.nextFloat();
		if(d<0)
		{
			System.out.println((int)d+" is an Invalid Input");
			System.exit(0);
		}
		System.out.println("Liters/100KM");
		float res1 = (n/d)*100;
		System.out.printf("%.2f",res1);
		System.out.println("\nMiles/gallons");
		double miles = d*0.6214;
		double fuel = n*0.2642;
		double res2 = miles/fuel;
		System.out.printf("%.2f",res2);
		
		
	}

}
