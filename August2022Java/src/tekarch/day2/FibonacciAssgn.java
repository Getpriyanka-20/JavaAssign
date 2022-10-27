package tekarch.day2;

public class FibonacciAssgn {

	public static void Fibo(int N) {
		int n1 = 0;
		int n2 = 1;
		int cnt = 0;

		while (cnt < N) {
			System.out.println(n1 + " ");

			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;

			cnt = cnt + 1;
		}

	}

	public static void main(String[] args) {

		int N = 10;

		Fibo(N);

	}

}
