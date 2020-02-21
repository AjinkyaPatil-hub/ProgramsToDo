package com.ajay.TIAA;

public class PrintPrime {

	public static void main(String[] args) {
		printPrime(100);
	}

	public static void printPrime(int num) {
		for (int i = 2; i <= num; i++) {
			boolean prime = isPrime(i);
			if(prime)
				System.out.print(i+"::");
		}

	}

	private static boolean isPrime(int num) {
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			return true;
		else
			return false;

	}
}
