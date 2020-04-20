package Test;

public class l04 {
	static String answer[][];

	public static String[][] solution(String[][] snap, String[][] tran) {

		for (int i = 0; i < snap.length; i++) {
			int money = Integer.parseInt(snap[i][0]);//

			for (int j = 0; j < tran.length; j++) {

				if (snap[i][0].equals(tran[j][0])) {

					if (tran[j][1].equals("SAVE")) {
						money += Integer.parseInt(tran[j][3]);

					} else if (tran[j][1].equals("WITHDRAW")) {
						money -= Integer.parseInt(tran[j][3]);
					}
				}

			}
		}

		return answer;

	}

	public static void main(String[] args) {

		String snap[][] = { { "ACCOUNT1", "100" }, { "ACCOUNT2", "150" } };
		String tran[][] = { { "1", "SAVE", "ACCOUNT2", "100" }, { "2", "WITHDRAW", "ACCOUNT1", "50" },
				{ "1", "SAVE", "ACCOUNT2", "100" }, { "4", "SAVE", "ACCOUNT3", "500" },
				{ "3", "WITHDRAW", "ACCOUNT2", "3" } };

		solution(snap, tran);

	}

}
