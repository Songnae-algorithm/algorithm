package programmers;

import java.util.*;

//����, ť
public class prog_2_ž {

	static public int[] solution(int[] heights) {
		int size = heights.length;
		int arr[] = new int[size+1]; // index �򰥸��� �ʱ� ���ؼ� size+1 ��ŭ ����
		boolean check = false;
		
		ArrayList<Integer> list  = new ArrayList<Integer>();
		list.add(0);
		
		for(int i=0;i<size;i++) 
			arr[i+1] = heights[i];
		
		for(int i=2; i<=size; i++) { //1���� 0�̴ϱ� 2������ Ȯ��
			for(int j=i-1; j>=1; j--) { // i-1������ �������� �� Ȯ��
				if(arr[i] <arr[j]) { //���������� ū�� �ִٸ�
					list.add(j); //�信 �־��ְ�
					check = true;
					break;
				}
			}
			
			if(check== false) //�ɸ��°� �ϳ� ���� ���´ٸ�-> ū�� ���ٴ°�
				list.add(0); //�׷� �信 0 �߰�
			
			check = false; // check�� true�ɷ����� ���� �����ϱ� false�� ó��
		}
		
		return list.stream().mapToInt(k->k).toArray(); // list to Array
		
	}
	
	
	public static void main(String[] args) {
		
	}
	
}
