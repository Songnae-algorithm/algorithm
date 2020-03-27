package Boj;

import java.util.*;

public class boj_1260_DFSBFS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(); //간선 입력받음
		int b = sc.nextInt();
		int start = sc.nextInt();//시작할 값

		int arr[][] = new int[a + 1][a + 1];//a+1인 이유 : 배열이 0부터가 아니라 1부터 시작해야 하기 때문
		//boolean chk[] = new boolean[arr.length];
		//boolean을 선언하면 모두 다 false로 되어있음 따로 초기화 x

		for (int i = 1; i <= b; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();

			arr[v1][v2] = 1;
			arr[v2][v1] = 1;

		}
//행렬 만들기
		
		boolean chk1[] = new boolean[arr.length];// boolean을 선언하면 모두 다 false로 되어있음 따로 초기화 x
		boolean chk2[] = new boolean[arr.length];

		//주의 ! ! chk를 각각 두개를 만들어 줘야함...여기서 두번이나 틀림
		//하나만 만들면 dfs를 돌은 값을 기억하구있기때문에 bfs에서는 다 true상태여서, 진행XX 
		
		dfs(arr, chk2, start);
		System.out.println();
		bfs(arr, chk1, start);
		
	}// 입력받아서 인접행렬 만들어 줌

	public static void dfs(int[][] a, boolean[] c, int v) {

	 
		int n = a.length - 1;// 5. 따로 선언안하고 for문에 c.length나 a.length도 가능

		c[v] = true;// 배열 c의 v번째(정점)을 true 로 하고
		// (한번 돌았을 때, v=i가 되니까)

		System.out.print(v + " ");// 정점 출력


		for (int i = 1; i <= n; i++) {// 1부터 n까지

			if (a[v][i] == 1 && !c[i]) {// 배열의 [1][2] 이 1이고, c[2]이 false면
				// 1에 붙어있는 다음꺼를 찾고 다 찾으면 dfs를 다시 선언( i=2가 됨)
				dfs(a, c, i);

				//dfs는 같은 레벨에 있는 애들보다 일단 첫번째꺼에 연결된애들을 끝까지 다 돌음 
			}
		}

	}

	public static void bfs(int[][] a, boolean[] c, int v) {

		Queue<Integer> que = new LinkedList<Integer>(); //bfs는 큐 이용  ! ! 

		int n = a.length - 1;

		que.offer(v);// que에 시작되는 정점 입력
		c[v] = true; //갔으니까 true로

		while (!que.isEmpty()) {
			v = que.poll();// 맨 앞에꺼를 뺴면서 저장 

			System.out.print(v + " ");

			for (int i = 1; i < a.length; i++) {
				if ((a[v][i] == 1) && (c[i] == false)) {
					//연결된 자식이 있으면
					que.offer(i);
					c[i] = true;
					//그 자식을 add하고 true로
					//bfs는 같은레벨에 있는애들을 일단 싹 봐준다!!!!!!
				}
			}

		}

	}
}