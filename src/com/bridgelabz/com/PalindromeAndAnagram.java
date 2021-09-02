package com.bridgelabz.com;
import java.util.*;
public class PalindromeAndAnagram{
	public static void main(String[] args)
	{
		PalindromeAndAnagram prime=new PalindromeAndAnagram();
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> primeNumArray= new ArrayList<Integer>();
		System.out.println("Enter num to check Anagram");
		int num=sc.nextInt();
		for(int i=2;i<=1000;i++)
		{
			boolean checkIfPrime=prime.checkPrime(i);
			if(checkIfPrime)
			{
				primeNumArray.add(i);
			}
			boolean checkIfAnagram = prime.checkAnagram(i,num);
			if(checkIfAnagram)
			{
				System.out.print(i+" is anagram\n");
			}
	}
		prime.checkPalindrome(primeNumArray);
	}

	public boolean checkPrime(int toCheck) 
	{
		boolean checkIfPrime=true;
		if(toCheck == 0 || toCheck==1)
		{
			return false;
		}
		for( int i=2;i<=toCheck;i++)
		{
			if(toCheck %i ==0)
			{
				 checkIfPrime=false;
			}
		}
		return checkIfPrime;
	}
	public void checkPalindrome(ArrayList<Integer> listPrime) {
		boolean isPalindrome = false;
		for(int ind = 0 ; ind< listPrime.size() ; ind++) {
			isPalindrome = false;
			int remainder, sum = 0;
			int number = listPrime.get(ind);
			while (number > 0) {
				remainder = number % 10; 
				sum = (sum * 10) + remainder;
				number = number / 10;
			}
			if (listPrime.contains(number))
				isPalindrome = true;
			
			if(isPalindrome) {
				System.out.println("\nPalindrome: "+number);
			}
		}
		if(!isPalindrome) 
		{
			System.out.println("\nNo Palindrome");
		}
		

	}
	public boolean checkAnagram(int firstNumber, int secondNumber)
	{
		int[] frequencyOfA = new int[30];
		int[] frequencyOfB = new int[30];
		while(firstNumber>0)
		{
			int eachDigit=firstNumber%10;
			frequencyOfA[eachDigit]++;
			firstNumber=firstNumber/10;
		}
		while(secondNumber>0)
		{
			int eachDigit=secondNumber%10;
			frequencyOfB[eachDigit]++;
			secondNumber=secondNumber/10;
		}
		for (int i = 0; i < 10; i++) {
			if (frequencyOfA[i] != frequencyOfB[i])
				return false;
		}
		return true;
	}

}
