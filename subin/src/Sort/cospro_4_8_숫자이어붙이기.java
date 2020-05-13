package Sort;

import java.util.*;

public class cospro_4_8_숫자이어붙이기 {
	ArrayList<Integer> num_list = new ArrayList<Integer>();

	public int[] func_a(int[] card) {
	    int card_count[] = new int [10];

	    for (int i = 0; i < card.length; i++) {
	        card_count[card[i]]++;
	    }

	    return card_count;
	}

	public void func_b(int level, int max_level, int num, int[] current_count, int[] max_count) {
	    if (level == max_level) {
	    	num_list.add(num);
	        return;
	    }

	    for (int i = 1; i <= 9; i++) {
	        if (current_count[i] < max_count[i]) {
	            current_count[i] += 1;
	            func_b(level + 1, max_level, num * 10 + i, current_count, max_count);
	            current_count[i] -= 1;
	        }
	    }
	}

	public int func_c(ArrayList<Integer> list, int n) {
	    for (int i = 0; i < list.size(); i++) {
	        if (n == list.get(i))
	            return i + 1;
	    }
	    return -1;
	}

	public int solution(int[] card, int n) {
	    int[] card_count = func_a(card);
	    func_b(0, card.length, 0, new int[10], card_count);
	    int answer = func_c(num_list, n);
	    return answer;
	}
	
	public static void main(String[] args) {
		
	}
}