//https://projecteuler.net/problem=1

public class projectEuler1 {
	public static void main(String[] args) {
		int num1 = 3; int num2 = 5; int mul3 = 0; int mul5 = 0; int sum1 = 0; int sum2 = 0;
		int mul3Length = 999/3; int mul5Length = 999/5;
		int[] mul5Array = new int[mul5Length]; int[] mul3Array = new int[mul3Length];		
		for (int i = 0 ; i < mul3Length ; i++) {
			mul3 += num1;
			if ((mul3 % 5) == 0) {
				mul3Array[i] = 0;
			}
			else {
				mul3Array[i] = mul3;
			}
			sum1 += mul3Array[i];
		}
		for (int i = 0 ; i < mul5Length ; i++) {
			mul5 += num2;
			mul5Array[i] = mul5;
			sum2 += mul5Array[i];
		}
		System.out.println(sum1 + sum2);
	}
}