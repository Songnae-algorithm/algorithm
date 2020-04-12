package Dfs_Bfs;

import java.util.*;
import java.io.*;

public class beak_소수경로 {

	public static boolean[] prime;
	
	//num부터 숫자 바꿔보기
	//type은 자리수, t는 0~9까지
	public static int changeNum(int num, int type, int t) {
		int result = 0;
		
		switch(type) {
		case 1: //1000의 자리
			result = t*1000;
			result += num - num/1000 * 1000;
			break;
		case 2: //100의 자리
			result = t*100;
			result += (num/1000 * 1000) + (num - num/100 *100);
			break;
		case 3: //10의 자리
			result = t*10;
			result += (num/100*100) + (num- num/10 *10);
			break;
		case 4: //1의 자리
			result = t;
			result += num/10*10;
			break;
		}
		return result;
	}
	
	public static boolean isPrime(int n) {
		if(n == 1)	return false;
		
		for(int i=2; i<n; i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}
	
	public static void bfs(int start, int end) {
		int count = -1;
		
		boolean visited[] = new boolean[10000];
		
		//int 배열로 초기화한 queue
		Queue<int[]> qu = new LinkedList<int[]>();
		qu.add(new int[] {start,0}); //처음에 큐에 {start,0} 넣음
		
		while(!qu.isEmpty()) {
			//빼기전에 num, cnt에 넣기
			int num = qu.peek()[0];
			int cnt = qu.peek()[1];
			
			qu.poll();//빼고
			if(num == end) {
				if(count == -1 || count > cnt)
					count = cnt;
				continue;
			}
			
			if(num<1000 || visited[num])
				continue;
			
			//이미 방문했던곳이 아니라면
			visited[num] = true;
			
			//순차적으로 1000이 넘으면서 소수인지 확인
			//i는 자리수, j는 0~9까지
			for(int i=1; i<=4; i++) {
				for(int j=0; j<10; j++) {
					int temp = changeNum(num,i,j);
					if(temp>=1000 && prime[temp]) {
						qu.offer(new int[] {temp,cnt+1});
					}
				}
			}
		}//while
		
		if(count == -1)
			System.out.println("Impossible");
		else
			System.out.println(count);
		
	}
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		prime = new boolean[10000]; //소수인지 아닌지 일단 구하기
		
		//1000부터 10000까지 소수인지 아닌지 찾아서 boolean
		for(int i=1000; i<10000; i++) {
			prime[i] = isPrime(i);
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		for(int i=0; i<size; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			bfs(start, end);
		}
	}
}

//참고 블로그 https://pangsblog.tistory.com/31