package BOJ;

import java.util.*;

public class bj_9935_���ڿ����� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		StringBuffer s1 = new StringBuffer(s);

		String comp = sc.next();

		int leng = comp.length(); // comp ����

		while (s.contains(comp)) {
			if (s.contains(comp)) {
				int idx = s.indexOf(comp);

				s = s1.delete(idx, idx + leng).toString();
				// ���� replace �ȉ������...�ٽ� s �� ����־������...�ФФ�
				// s=s.replace(comp,""); �̷��� ����.. �ٵ� ��¥�� �̰͵� �޸��ʰ�
			}

		}
		if (s.equals("")) {
			System.out.println("FRULA");
		} else
			System.out.println(s);
	}
}
