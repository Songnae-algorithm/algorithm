package Dfs_Bfs;

import java.util.*;

public class beak_영역구하기 {

	
	//30min
    static int count = 0;
    static void dfs(int arr[][], int x, int y){
        arr[x][y] = 1;
        count++;
        
        int dx[] = {0,0,1,-1};
        int dy[] = {1,-1,0,0};
        
        for(int i=0; i<4; i++){
            int nowx = x + dx[i];
            int nowy = y + dy[i];
            
            if(nowx >=0 && nowx<arr.length &&nowy>=0 && nowy<arr[0].length && arr[nowx][nowy]==0){
                dfs(arr,nowx,nowy);
            }
        }
        
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        int arr[][] = new int[n][m];
        for(int i=0;i<k;i++){
            int lx = sc.nextInt();
            int ly = sc.nextInt();
            int rx = sc.nextInt();
            int ry = sc.nextInt();
            
            for(int y = ly; y<ry; y++){
                for(int x= lx; x<rx; x++){
                    arr[y][x] = 1;
                }
            }//in for
        }//out for
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m; j++){
                if(arr[i][j] == 0){
                    dfs(arr,i,j);
 
                    if(count!=0){
                        list.add(count);
                        count = 0;//초기화
                    }
                }//out if
            }//in for
        }//out for
        
        list.sort(null);
        
        System.out.println(list.size());
        for(int i=0;i<list.size();i++)
        	System.out.print(list.get(i) + " ");
   
    }
}
