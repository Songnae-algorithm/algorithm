package sort;

import java.util.*;

public class pr3_여행경로2 {

	static boolean chk[];
	static ArrayList<String> list = new ArrayList<>();
	static String str = "";

	private static void dfs(String[][] arr, boolean chk[], String str, String end, int cnt) {
		str += end + ",";
		
		if (cnt == arr.length) {// cnt랑 길이가 똑같아지면
			list.add(str);
			return;
		}
// ICN으로 시작해서 길이가 같은 모든 경로를 찾아서 return 해 줌 
		for (int i = 0; i < arr.length; i++) {
			if (chk[i] == false && arr[i][0].equals(end)) { // INC-JFK 라고 쳤을 때 end는 JFK. JFK로
															// 시작하는 (0번째 배열)
				chk[i] = true;// 갔으니까 true

				dfs(arr, chk, str, arr[i][1], cnt + 1);// 한번 갈때마다 cnt ++ 해주고, arr 길이랑 같을때까지만 함

				chk[i] = false;
				//여기서 왜 false로 돌려주는지 궁금 ~~~
			}
		}
	}

	public static String[] solution(String[][] tickets) {

		for (int i = 0; i < tickets.length; i++) {
			if (tickets[i][0].equals("ICN")) {
				chk = new boolean[tickets.length];// 갔는지 체크
				chk[i] = true; // ICN있는곳을 도니까
				//
				dfs(tickets, chk, "ICN,", tickets[i][1], 1);
				//chk[i] = false;
			}
		}

		Collections.sort(list); 
		//ICN으로 시작해서 길이가 같은 모든 경로를 가지고있음. 문자열 순서로 정렬하기로 했으니까 정렬해준다 
		
		String[] answer = list.get(0).split(",");
		//정렬이 되었으니까 첫번째 list배열에 있는 값들을 ","로 잘라서 넣는다 

		
		return answer;
	}

	public static void main(String[] args) {
		String arr[][] = { { "ICN", "JFK" }, { "HND", "IAD" }, { "JFK", "HND" } };

		String arr2[][] = { { "ICN", "SFO" }, { "ICN", "ATL" }, { "SFO", "ATL" }, { "ATL", "ICN" }, { "ATL", "SFO" } };

		solution(arr);
	}
}
