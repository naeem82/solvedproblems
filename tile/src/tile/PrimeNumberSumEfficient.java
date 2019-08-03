package tile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrimeNumberSumEfficient {
	public static void main(String[] args) {
		// Given any number greater than 2, implement a function that will
		// find the two prime numbers that sum to that number.
		twoPrimerNumberSum(100);
	}

	public static void twoPrimerNumberSum(int number) {

		Set<Integer> set = findPrimeNumberList(number);
		for (Integer integer : set) {
			int value = number - integer;
			if (set.contains(value)) {
				System.out.println(number + " = " + integer + " + " + value);
				break;
			}

		}

	}

	// 20 ->2,3,5,7,11,13,17
	public static Set findPrimeNumberList(int number) {
		Set<Integer> set = new HashSet();
		for (int i = 2; i <= number; i++) {
			if (isPrime(i))
				set.add(i);

		}
		return set;

	}

	public static boolean isPrime(int number) {
		int factor = 2;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				factor++;
			}
		}
		if (factor == 2)
			return true;
		else
			return false;
	}

}
