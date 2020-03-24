package Greedy;

import java.util.Arrays;

public class prog_3_단속카메라 {

    public int solution(int[][] routes) {
        int answer = 0;
        int cam = -30001; //제일 작은 값으로 초기화
        Arrays.sort(routes, (a,b) -> Integer.compare(a[1], b[1])); // 1번째 배열로 오름차순
        
        
        for(int i=0;i<routes.length; i++) {
        	if(cam < routes[i][0]) {//내 끝점보다 현재 시작점이 큰 경우에는 겹치지 않는다.
        		cam = routes[i][1]; //cam에 다시 끝점을 넣어주고 다음 시작점과 비교한다
        		answer++;
        	}
        }
        
        return answer;
    }
	
    public static void main(String args[]){ 
        String str1 = "Hello! Java World"; 

        int index = str1.indexOf("Java");
        int size = "Java".length() ; 

        String str2 = str1.substring(index, index+size);
        str2 = str2.toLowerCase();
        str2 = str2.replace('a', 'A');

        System.out.println(str2);
   }
}
