package Test;

public class T0425_2_2 {

	public static int solution(String[] ip_addrs, String[] langs, int[] scores) {
		int answer = 0;
		int len = ip_addrs.length;
		boolean chk[] = new boolean[len];

		for (int i = 0; i < len; i++) {
			if (langs[i].equals("C++") || langs[i].equals("C#")) {
				langs[i] = "C";
			}
		}
		// C#, C++을 C로 바꿔줌

		for (int i = 0; i < len; i++) {
			
		}

		return answer;

	}

	public static void main(String[] args) {
		String ip[] = { "5.5.5.5", "155.123.124.111", "10.16.125.0", "155.123.124.111", "5.5.5.5", "155.123.124.111",
				"10.16.125.0", "10.16.125.0" };
		String lang[] = { "Java", "C++", "Python3", "C#", "Java", "C", "Python3", "JavaScript" };
		int score[] = { 294, 197, 373, 45, 294, 62, 373, 373 };

		String ip1[] = { "7.124.10.0", "7.124.10.0", "0.0.0.0", "7.124.10.0", "0.0.0.0", "7.124.10.0" };
		String lang1[] = { "C++", "Java", "C#", "C#", "C", "Python3" };
		int score1[] = { 314, 225, 45, 0, 155, 400 };

		solution(ip1, lang1, score1);

	}

}
