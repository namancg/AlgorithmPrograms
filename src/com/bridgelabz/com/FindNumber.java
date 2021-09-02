package com.bridgelabz.com;
import java.util.*;
public class FindNumber {
	public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a number from 0 to 100");
		int N = sc.nextInt();
		guessNumber(0,N-1);
		sc.close();
	}
	public static void guessNumber(int start, int end)
	{
		if(start==end)
		{
		System.out.println("your number is "+start);
		return;
		}
		int mid=(start+end)/2;
		System.out.println("Is your number between "+start+"& "+mid+"? Then press 1");
		System.out.println("Is your number between "+(mid+1)+"& "+end+"? Then press 0");
		int temp=sc.nextInt();
		if(temp == 1)
		{
			guessNumber(start,mid);
		}
		else
		{
			guessNumber(mid+1,end);
		}
		
	}

}
