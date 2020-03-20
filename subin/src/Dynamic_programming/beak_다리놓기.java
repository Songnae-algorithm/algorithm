package Dynamic_programming;

import java.util.*;
import java.math.BigInteger;

public class beak_다리놓기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			int n= sc.nextInt();
			int m = sc.nextInt();
			
			BigInteger sum =new BigInteger("1");
			
			int temp = n;
			while(temp>0) {
				sum = sum.multiply(BigInteger.valueOf(m));
				m--;
				temp--;
			}
			
			while(n>0) {
				sum = sum.divide(BigInteger.valueOf(n));
				n--;
			}
			
			System.out.println(sum);
		}
		
	}
}
