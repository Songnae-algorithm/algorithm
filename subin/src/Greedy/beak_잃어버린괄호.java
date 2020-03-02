package Greedy;

import java.util.*;

//50min
public class beak_잃어버린괄호 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		//처음은 무조건 +부터 시작하니까 -나오기 전까지 더해주고 이 값에서 나중에 나온 값을 빼준다
		String s_split[] = s.split("-"); //- 다 뺴준다    --> +와 숫자가 섞여있다
		
		String tmp[] = s_split[0].split("\\+"); // 첫 - 전 숫자들은 +로만 이루어져있으니까 따로 전부 더한다! -->숫자만 들어있다
		
		int first = 0;
		for(int i=0;i<tmp.length;i++)
			first = first + Integer.parseInt(tmp[i]);
		
		int sum=0;
		for(int i=1;i<s_split.length;i++) {
			tmp = s_split[i].split("\\+");
			for(int j=0; j<tmp.length; j++)
				sum = sum + Integer.parseInt(tmp[j]);
		}
		
		System.out.println(first-sum);
		
	}
}

//https://dalconbox.tistory.com/41
