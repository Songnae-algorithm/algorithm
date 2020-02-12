package Maze;

import java.util.Scanner;

class Codeup_성실한개미{
   
	//Maze
	//아니 이런문제로 한시간이나 쓰다니... 조건도 은근 많고...!
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int maze[][] = new int[11][11];
        
        //한줄씩 입력받는법 까먹지말자
        for(int i=1;i<11; i++){
        		String a = sc.nextLine();
        		String b[] = a.split(" ");
                for(int j=0;j<10; j++)
                	maze[i][j+1]= Integer.parseInt(b[j]);
        }
        
        int x = 2;
        int y = 2;
  
        while(true){
        	
            if(maze[x][y]==2) {
            	maze[x][y]=9;
            	break;
            }
        	
            if(maze[x][y+1]==1){ //오른쪽이 벽
            	if(maze[x+1][y] ==1) // 밑에도 벽
            		break;
            	else // 밑이 벽이 아니면
            		x++;
            }
            else if(maze[x][y+1] !=1) { // 오른쪽이 벽이 아니면
            	y++;
            }
            
            if(maze[x][y]==2) {
            	maze[x][y]=9;
            	break;
            }
            
            maze[x][y]=9;
            
        }//while
        
        maze[2][2] = 9;
        
        
        
        for(int i=1; i<11; i++){
            for(int j=1; j<11; j ++){
                System.out.print(maze[i][j] + " ");
            }
            System.out.println("");
        }      
    
    }
}