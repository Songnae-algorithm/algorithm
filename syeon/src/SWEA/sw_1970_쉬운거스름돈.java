package SWEA;

import java.util.Scanner;

public class sw_1970_쉬운거스름돈 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for (int i = 1; i < a + 1; i++) {
			int mon = sc.nextInt();

			int fivman = 0;
			int man = 0;
			int fivchun = 0;
			int chun = 0;
			int fivhun = 0;
			int hun = 0;
			int fivten = 0;
			int ten = 0;

			while (mon != 0) {
				if (mon >= 50000) {
					fivman = mon / 50000;
					mon = mon % 50000;

				} else if (mon >= 10000) {
					man = mon / 10000;
					mon = mon % 10000;

				} else if (mon >= 5000) {
					fivchun = mon / 5000;
					mon = mon % 5000;

				} else if (mon >= 1000) {
					chun = mon / 1000;
					mon = mon % 1000;

				} else if (mon >= 500) {
					fivhun = mon / 500;
					mon = mon % 500;

				} else if (mon >= 100) {
					hun = mon / 100;
					mon = mon % 100;

				} else if (mon >= 50) {
					fivten = mon / 50;
					mon = mon % 50;

				} else if (mon >= 10) {
					ten = mon / 10;
					mon = mon % 10;

				} else if (mon < 10) {
					mon = 0;
				}
				if (mon == 0) {
					break;
				}
			} // while

			System.out.println("#" + i);
			System.out.println(fivman + " " + man + " " + fivchun + " " + chun + " " + fivhun + " " + hun + " " + fivten
					+ " " + ten);

		} // 요기
	}
}
