package mocktest;

import java.util.Scanner;

public class prgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Inmate's name:");
		String name = sc.nextLine();
		System.out.println("Inmate's father's name:");
		String fname = sc.nextLine();
		String fullname = name+" "+fname;
		for(int i=0;i<fullname.length();i++) {
			if(Character.isDigit(fullname.charAt(i))) {
				flag++;
				System.out.println("Invalid name");
				System.exit(0);
			}
		}
		if(flag == 0)
			System.out.println(fullname.toUpperCase());
	}

}
