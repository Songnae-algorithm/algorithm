package T0221;

import java.util.*;

public class t2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String as[] = a.split(" ");
		
		int m = Integer.parseInt(as[0]);
		int n = Integer.parseInt(as[1]);
		
		int sum = 0;
		int min = (int)Math.ceil(Math.sqrt(m));
		
		for(int i=min; i<=Math.floor(Math.sqrt(n)); i++)
			sum = (int) (sum + Math.pow(i, 2));
		
		System.out.println(min*min +" "+sum);
	}
	
}
