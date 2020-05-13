package Math;

import java.text.*;
import java.util.*;
public class cospro_시침의_각도구하기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		double a = (h*30) + m/2;
		double b = m*6;
		
		//반올림해서 특정 자리수까지만 표시하기
		DecimalFormat form = new DecimalFormat("#.#");
		
		if(a>b)
			System.out.println(form.format(a-b));
		else
			System.out.println(form.format(b-a));
		
		//System.out.println(form.format(12.2549));
	}
}

//참고 - https://pugeun.tistory.com/entry/시계-바늘-각도-구하기-문제