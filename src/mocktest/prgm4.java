package mocktest;

import java.util.ArrayList;
import java.util.Scanner;

public class prgm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		String arr[][] = new String[n][3];
		for(int i=0;i<n;i++) {
			String item_details = sc.next();
			arr[i] = item_details.split(",");			
		}
		/*for(int i=0;i<n;i++)
			for(int j=0;j<3;j++)
				System.out.print(arr[i][j]); */		
		int discount[] = new int[n];
		ArrayList<Integer>min= new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			discount[i]  = Integer.valueOf(arr[i][1])*Integer.valueOf(arr[i][2])/100;
		/*for(int i=0;i<discount.length;i++)
			System.out.println(discount[i]);*/
		int i=0,m=discount[0];
		for(i=1;i<discount.length;i++)
		{
			if(discount[i]<= m )
				m = discount[i];
		}
		
		for(i=0;i<discount.length;i++) {
			if(discount[i] == m)
				System.out.println(arr[i][0]);
		}
		
			
	
			
		
	}

}

