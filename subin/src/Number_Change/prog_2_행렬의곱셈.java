package Number_Change;

public class prog_2_행렬의곱셈 {

	//1h
    static public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int [arr1.length][arr2[0].length];
        
        //행렬 i*j 와 행렬 j*k 는 항상 j가 같아야 계산 할 수 있다.
        for(int i=0; i<arr1.length; i++) {
        	for(int j=0; j<arr1[0].length; j++) {
        		for(int k=0; k<arr2[0].length; k++) {
        			answer[i][k] += arr1[i][j] * arr2[j][k];
        		}
        	}
        }

        return answer;
    }
	
	public static void main(String[] args) {
		int a1[][] = {{1,4},{3,2},{4,1}};
		int a2[][] = {{3,5},{21,8}};
		
		solution(a1,a2);
	}
}
