import java.util.*;

public class Review {
	static int n;
	public static void dfs(ArrayList<Integer> answer, int start, boolean edge[][], boolean visited[]) {
		answer.add(start);
		visited[start] = true;
		
		for(int i=1; i<=n; i++) {
				if(edge[start][i]==true && !visited[i])
					dfs(answer, i, edge, visited);			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt(); 				// 정점의 개수 
		int m = sc.nextInt(); 			// 간선의 개수 
		int start = sc.nextInt(); 		// 탐색 시작할 정점 번호 
		
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		boolean edge[][] = new boolean[n+1][n+1];
		boolean visited[] = new boolean[n+1];
		
		int a,b;
		
		for(int i=0; i<5; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			edge[a][b] = true;
			edge[b][a] = true;
		}
		
		
		dfs(answer, start, edge, visited);
		
		for(int i=0; i<answer.size();i++) {
			System.out.println(answer.get(i));
		}
	}
}