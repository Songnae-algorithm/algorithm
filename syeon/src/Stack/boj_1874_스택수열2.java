package Stack;

import java.util.*;

public class boj_1874_스택수열2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int in = sc.nextInt();
		Queue<Integer> list = new LinkedList<>();

		Stack<Integer> st = new Stack<>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < in; i++) {
			list.add(sc.nextInt());

		}

		int i = 1;

		while (i <= in) {
			if (!st.isEmpty() && st.peek() == list.peek()) {
				st.pop();
				sb.append("-\n");
				list.remove();

			} else if (list.peek() < st.peek()) {
				System.out.println("NO");
				break;
			}

			else {
				st.push(i);
				sb.append("+\n");
				i++;
			}

		}
		System.out.println(sb);

	}

}
