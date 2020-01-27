package Max_Min;

import java.util.*;

public class beak_달팽이는올라가고싶다 {

	//https://yahohococo.tistory.com/28
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		
		int num = 0;	double day = 0;
//		while(num <v) {
//			day++;
//			
//			num = num + a;
//			if(num >= v)
//				break;
//			
//			num = num - b;
//		}
		
		day = (v-b)/ (a-b);

		if((v-b)%(a-b) !=0 )
			day++;
		
		System.out.println(day);
	}
}
