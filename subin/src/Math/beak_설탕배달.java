package Math;

import java.util.*;

public class beak_설탕배달 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		
		//1.무조건 값에 -3을 하고  2.그 값이 5로 나누어지면 최소의 움직임  3.만약 break에 걸리지않고 0이하가 되면 -1
		while(true) {
			if(n%5==0) {
				//5로 나누어진다면 큰 수로 나눌 수 있는거니까 더 계산하지말고
				System.out.println(n/5 + count); //세어졌던 count에 몫을 더하면 값이 나온다
				break;
			}
			else if(n < 0) { //5로 나누어떨어지지않고  n이 2, 1..로 가면 -로가니까 break
				System.out.println(-1);
				break;
			}
			
			//3일때는 3-3 n=0이 되고 0%5는 0으로 count==1로 끝낼 수 있다. 놀랍...!
			n = n-3;
			count++;
			
		}		
	}
}