package Stack_Queue;

import java.util.*;
//아니... 터지면 +1인줄 알았지 누가 2인줄 알았나..하..
public class prog_크레인인형뽑기게임 {

    static int b[][];
    static int n;
    static LinkedList<Integer> stk = new LinkedList<>();
    
    void go(int k){
        for(int i=1; i<=n; i++){
            if(b[i][k] !=0){
                stk.add(b[i][k]);
                b[i][k] = 0;
                break;
            }
        }    
    }
    
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        b = new int[board.length+1][board.length+1];
        n = board.length;
            
        for(int i=board.length-1; i>=0; i--){
            for(int j=0; j<board[0].length; j++)
                b[i+1][j+1] = board[i][j];
        }
        
        
        for(int i=0; i<moves.length; i++){
            go(moves[i]);//stk에 넣고
         
            if(stk.size()>=2 && stk.getLast() == stk.get(stk.size()-2)){
                stk.removeLast();
                stk.removeLast();
                answer += 2;
            }
                
        }
        
        return answer;
    }
}
