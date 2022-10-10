package mocktest;

import java.util.Scanner;

public class prgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of pizzas bought: ");
		int pi_num = sc.nextInt();
		System.out.print("Enter the no of puffs bought: ");
		int pu_num = sc.nextInt();
		System.out.print("Enter the no of cool drinks bought: ");
		int cd_num = sc.nextInt();
		int total_price = pi_num*100+pu_num*20+cd_num*10;
		System.out.println("\nBill Details");
		System.out.println("No of pizzas:"+pi_num);
		System.out.println("No of puffs:"+pu_num);
		System.out.println("No of cool drinks:"+cd_num);
		System.out.println("Total price="+total_price);
		System.out.println("ENJOY THE SHOW!!!");

	}

}
