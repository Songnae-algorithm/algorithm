package Programmers;

public class pr2_행렬의곱셈 {

	public int[][] solution(int[][] arr1, int[][] arr2) {
	    //5/27 01:46- 
	     //0604 00:47- 01:25
	        
	        int[][] answer =new int[arr1.length][arr2[1].length];
	        //arr1의 행, arr2의 열 갯수만큼 새로운 배열이 시작됨
	        
	        for(int i=0;i<arr1.length;i++){
	            for(int j=0;j<arr2[1].length;j++){
	                
	                for(int k=0;k<arr1[1].length;k++){
	                    answer[i][j]+=arr1[i][k]*arr2[k][j];
	                }
	              
	            }
	        }
	        
	        return answer;
	    }
	
}
