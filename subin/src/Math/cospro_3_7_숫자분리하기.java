package Math;

public class cospro_3_7_숫자분리하기 {

	public static void main(String[] args) {
		int a = 123456789;
		
		int divisor = 1;
		while(a/divisor !=0) {
			int f = a/divisor;
			int b = a%divisor;
			
			divisor *= 10;
			
			System.out.println(f + "  " + b);
		}
	}
}

//하나빼고 하나 넣고