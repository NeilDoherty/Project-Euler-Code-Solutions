//https://projecteuler.net/problem=2

public class projectEuler2 {
	public static void main(String[] args) {
		int fib1 = 1 ; int fib2 = 2; int fib3 = 0; int sum = fib2;
		while (fib3 < 4000000) {
			fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
			if ((fib3 % 2) == 0) {
				sum += fib3;
			}
		}
		System.out.println(sum);
	}
}