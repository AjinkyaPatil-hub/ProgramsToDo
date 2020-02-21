package com.ajay.immutable;

public class Prime {

	public static void main(String[] args) {

		String str = "ajay";
		String str2 = "asdajayadfssd";
		System.out.println(str2.contains(str));
		int range = 10;
		//primeNums(range);
		// primeNumber(7);
		printPrime(range);
	}
	

	private static void printPrime(int range) {
		
		for(int i=2;i<range;i++) {
			if(isPrime(i)) {
			System.out.println("prime number : "+i);
			}
		}
		
	}


	private static boolean isPrime(int range) {
		
		for(int i=2;i<range;i++) {
			if(range%i == 0) {
				return false;
			}
		}
		return true;
	}


	private static void primeNumber(int no) {
		boolean flag = false;
		for (int i = 2; i < no / 2; i++) {
			if (no % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("given no is prime");
		} else {
			System.out.println("given no.  is not prime");
		}

	}

	private static void primeNums(int range) {

		for (int i = 1; i < range; i++) {
			int counter = 0;
			for (int num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				System.out.println("Prime numbers are :" + i);
			}

		}

	}

}
