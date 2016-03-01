import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int m = 1;
		while (m <= n) {
			if (m % 2 == 1) {
				System.out.println(m);
			}
			m++;
		}

		int M = in.nextInt();
		int N = in.nextInt();
		int power = 1;
		for (int i = 0; i < M; i++) {
			power = power * N;
			System.out.println(power);

		}

		int sum = 0;
		int number = 0;
		do {
			number = in.nextInt();
			sum = sum + number;

		} while (number != 0);
		System.out.println(sum);

		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0 || i % 11 == 0) {
				System.out.println(i);

			}
		}
	}

}
