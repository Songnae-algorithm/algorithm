package Programmers;
import java.util.*;

public class pr2_프렌즈4블록3 {


	    
	    static class Node{
	        int x;
	        int y;
	        
	        public Node(int x,int y){
	            this.x=x;
	            this.y=y;
	            
	        }
	    }
	    static Queue<Node> qu=new LinkedList<>();
	    static char arr[][];
	   
	    
	    public static void square( int x, int y ){
	        int dx[] ={1,0,1}; //오,아,대각선
	        int dy[]= { 0, -1,-1 };
	        
	         Queue<Node> sq=new LinkedList<>();  
	        //매 번 x,y 들어올때마다 사각형인것만 찾아서 더해줄 네모
	        
	        char c =arr[x][y];
	        
	        for(int i=0;i<3;i++){
	            int nx=x+dx[i];
	            int ny=y+dy[i];
	            
	            if(nx>=0 &&nx<arr.length&&ny>=0&&ny<arr[1].length&&arr[nx][ny]==c){
	                sq.add(new Node(nx,ny));//돌면서 c랑 같으면 sq에 add 
	            }
	        }
	        
	        if(sq.size()==3){
	            
	            //네모가 만들어졌으면 !!
	            for(int i=0;i<3;i++){
	                Node a=sq.poll();
	                //System.out.println(c);
	                int ax=a.x;
	                int ay=a.y;
	                
	                qu.add(new Node(ax,ay));
	               
	                //전제 qu에 x,y넣기 
	            }
	             qu.add(new Node(x,y));//원래의 x,y도 넣기 
	        }
	    }
	    public int solution(int m, int n, String[] board) {
	        //0605 03:21-
	        int answer = 0;
	        
	        arr=new char[m][n];
	        
	         for(int i=0;i<m;i++){
	             String s=board[i];
	             
	            for(int j=0;j<n;j++){
	                arr[i][j]=s.charAt(j);
	            }
	         }
	        
	       int cnt=0;
	        
	       while(cnt<1000){
	         
	           
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                if(arr[i][j]!='.'){
	                   square(i,j);
	                }//.이 아닐때만 (프렌즈 문자일때만)
	                
	            
	                }
	            }
	           
	           while(!qu.isEmpty()){//!qu 주의 !!!! 
	               Node q=qu.poll();
	               
	               int x=q.x;
	               int y=q.y;
	               
	               if(arr[x][y]!='.'){
	                   arr[x][y]='.';
	                   answer++;
	                   
	                   //이미 .일 수도 있으니가 (중복될 경우), .이 아닐때만 .으로 바꿔주기
	                   
	                 }
	              else{
	                  continue;
	              }
	           }
	           
	           for(int k=0;k<m;k++){
	           for(int i=m-1;i>0;i--){//밑에서부터 봐주면서 위로 올라가기 !
	               for(int j=0;j<n;j++){
	                   if(arr[i][j]=='.' && arr[i-1][j]!='.'){
	                       
	                       //나는 .인데 내 위에가 문자면 자리 바꿔주기
	                    arr[i][j]=arr[i-1][j];
	                       arr[i-1][j]='.';
	                   }
	                   
	                 }
	              }
	               
	           }
	          cnt++;
	           
	       }
	        return answer;
	    }
	}

	
}
