package Dynamic_programming;

import java.util.*;

public class beak_정수삼각형 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        
        int size = 1;
        for(int i=0;i<n;i++){
            for(int j=0; j<size; j++){
                arr[i][j] = sc.nextInt();
            }
            size++;
        }//for

        //내가 가질 수 있는 값은 1)나 + 내 위  2)나 + 내 왼쪽 위
        //가질 수 있는 max값들을 모든 arr[][]에 차곡차곡 넣어놓는다
        for(int i=1;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		if(j==0)//j가 0이라는건 바로 밑에서 왔다는 상황밖에 없다
        			arr[i][j] = arr[i][j] + arr[i-1][j];
        		else if(j == n-1)//j가 끝까지 갔다는건 내 왼쪽 아래 대각선에서 왔다는 뜻
        			arr[i][j] = arr[i][j] + arr[i-1][j-1];
        		else //나머지 상황에서는 위의 두 상황을 다 고려해서 max를 넣는다
        			arr[i][j] = Math.max(arr[i][j] + arr[i-1][j], arr[i][j] + arr[i-1][j-1]);
        	}
        }
        
        //맨마지막 줄이 각자가 가질 수 있는 max값을 가지고 있으므로 그들 중 max가 정답
        int max = 0;
        for(int j=0;j<n;j++)
        	max = Math.max(max, arr[n-1][j]);
        
        System.out.println(max);
    }
}