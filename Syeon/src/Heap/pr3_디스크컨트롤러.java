package Heap;

import java.util.*;

class Node {
	int start;
	int end;

	public Node(int start, int end) {
		this.start = start;
		this.end = end;

	}

	   public int compareTo(Node target) {
	        return this.start <= target.end ? 1 : - 1;
	    }

}

public class pr3_디스크컨트롤러 {

	public static int solution(int[][] jobs) {
		int answer = 0;

		PriorityQueue<Node> qu = new PriorityQueue<>();

		Arrays.sort(jobs, new Comparator<int[]>() {

//			public int compare(int a[], int b[]) {
//				if (a[0] == b[0]) // 0번째 행렬이 같을 때는
//					return a[1] - b[1]; // 뒤에거로 오름차순
//				else
//					return a[0] - b[0]; // 0번째행렬로 오름차순
//				// if랑 return 이랑 같아야 함
//				// return 이 기준이어야 함
//			}
//		});

		for (int i = 1; i < jobs.length; i++) {
			qu.add(new Node(jobs[i][0], jobs[i][1]));
		}

		int starttime = jobs[0][0];
		int endtime = jobs[0][1];
		int totaltime = endtime - starttime;

		while (!qu.isEmpty()) {
			System.out.println(starttime + " " + endtime + " " + totaltime);
			Node no = qu.poll();
			starttime = no.start;// 0
			endtime = endtime + no.end;
			totaltime += endtime - starttime;

			if (endtime < no.start) {
				starttime = no.start;
				endtime = starttime + no.end;
				totaltime += endtime - starttime;

			}

			System.out.println(starttime + " " + endtime + " " + totaltime);

		}
		answer = totaltime / jobs.length;
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {

		int arr[][] = { { 0, 3 }, { 1, 9 }, { 500, 6 } };
		solution(arr);
	}

}
