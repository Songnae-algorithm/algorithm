package Stack_Queue;

import java.util.*;

public class pr_2_프린터 {

	public static int solution(int[] priorities, int location) {

		LinkedList<Integer> que = new LinkedList<Integer>();
		LinkedList<Integer> index = new LinkedList<Integer>();
		int answer = 0;
		
		for (int i = 0; i < priorities.length; i++) {
			que.offer(priorities[i]);
			index.offer(i);
		}
		
		boolean chk = false;
		
		while(true){
		

			//배열의 가장 앞에 있는 값과 뒤에있는값들 비교
			for(int i=1;i<que.size();i++) {
			
				if(que.get(0)<que.get(i)) {//맨 앞의 값보다 뒤의값이 클 때
					int out = que.poll();//맨 앞의값을 빼고, out에 저장해 둠 
					que.offer(out); //맨 뒤로 추가함 
	
					int outidx = index.poll(); //index값도 동일하게 바꿔줌
					index.offer(outidx);
	
	
					chk = true;//true로 바꾸고 break
					break;	//가장 가까운 반복문(for/while) 빠져나감 if문 아님!
				}
			}
			
			
			if(chk==false) {//맨 앞에 있는 값이 가장 큰 값
				int a=index.remove();//인덱스 맨 앞에 있는 값을 지우고 a에 저장해놓음
				que.remove(0);//큐에서도 맨 앞에있는 값을 지워줌
				answer++;
				
				if(a==location) {//인덱스값과 location이 같으면 break 하고 answer을 리턴
					break;
					
				}
			}
			
			chk=false;
			
		}
		
	
//		System.out.println(answer);
		return answer;

	}

	public static void main(String[] args) {
		int[] priorities = { 2, 1, 3, 2 };
		int location = 2;

		solution(priorities, location);
	}

}
