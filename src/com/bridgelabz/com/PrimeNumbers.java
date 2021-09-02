package com.bridgelabz.com;
public class PrimeNumbers {
	private final static int startNumber = 2;
	private final static int endNumber=1000;
	public static void main(String[] args) {
		for (int i = startNumber; i <= endNumber; i++) {
			int factors = 0;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if ((i % j) == 0) {
					factors++;
					break;
				} else
					continue;
			}
			if (factors == 0) {
				System.out.println(i+" IS A PRIME NUMBER");
			}
		}


	}

}
