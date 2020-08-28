package yaksha;

import java.util.*;

public class MainClass {
	static int sum = 0; 
	static int result = 0;

	public static int checkSumOfOddEvenDigits(int number) {
		while (number != 0) {
			int remainder = number % 10;
			sum = sum + remainder;
			number = number / 10;
		}

		if (sum % 2 != 0)
			return 1;
		else
			return 0;
	}

	public static int SumOfOddDigits(int number) {
		if (sum % 2 != 0) {
			sum = 0;
			while (number != 0) {
				int remainder = number % 10;
				if (remainder % 2 != 0) {
					sum = sum + remainder;
				}
				number = number / 10;
			}

			if (sum % 2 != 0) {
				result = 1;
			}
		}
		return result;
	}

	public static int SumOfEvenDigits(int number) {
		if (sum % 2 == 0) {
			sum = 0;
			while (number != 0) {
				int remainder = number % 10;
				if (remainder % 2 == 0) {
					sum = sum + remainder;
				}
				number = number / 10;
			}
			if (sum % 2 == 0) {
				result = 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oddResult = 0;
		int evenResult = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number1 = scanner.nextInt();
		Number number = new Number(number1);
		if (checkSumOfOddEvenDigits(number.getNumber()) == 1)
			oddResult = SumOfOddDigits(number.getNumber());
		else
			evenResult = SumOfEvenDigits(number.getNumber());
		if (oddResult == 1)
			System.out.println("Sum of odd digits is odd");
		if (evenResult == 1)
			System.out.println("Sum of even digits is even");
		scanner.close();
	}
}
