package Stack_Queue;

import java.util.*;

public class boj_1874_스택수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> list = new LinkedList<>();
		Stack<Integer> st = new Stack<>();
		StringBuilder sb = new StringBuilder();

		int in = sc.nextInt();
		int plus = 0;
		int minus = 0;

		for (int i = 0; i < in; i++) {
			list.add(sc.nextInt());
		}

		int i = 0;

		while (!list.isEmpty()) {
			if (!st.isEmpty() && st.peek() == list.peek()) {
				list.remove();
				st.pop();
				sb.append("-");
				sb.append("\n");
				// System.out.println("+");

				minus++;

			} else {
				i++;
				st.add(i);
				sb.append("+");
				sb.append("\n");
				plus++;
				// System.out.println("-");
			}

			if (!st.isEmpty() && st.peek() > list.peek()) {
				break;
			}
		}
		if (minus != plus) {
			System.out.println("NO");
		} else {

			System.out.println(sb.toString());
		}
	}

}
