package T0221;

import java.util.*;

public class t3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double h = sc.nextDouble();
		int u = sc.nextInt();
		int d = sc.nextInt();
		int f = sc.nextInt();
		
		double first_height = 0;
		double middle_height = 0;
			
		double nowf = u * 0.01 * f;
		
		int day = 0;
		
		while(true) {
						
			first_height = first_height + u - day*nowf;
						
			if(first_height >= h) {
				System.out.println("Success " + (day+1));
				break;
			}
			
			if(first_height <0) {
				System.out.println("Failure " + (day+1));
				break;
			}
			
			middle_height = first_height - d;
			
			if(middle_height <0) {
				System.out.println("Failure " + (day+1));
				break;
			}
			
			day++;
			first_height = middle_height;
		}
	}
}
