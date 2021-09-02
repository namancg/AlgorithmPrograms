package com.bridgelabz.com;
import java.util.*;
public class FindPermutation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String:");
		String word = scanner.nextLine();
		char[] letters = word.toCharArray();
		scanner.close();
		findPermutationRecursive(letters, 0);
		findPermutationIterative(letters, 0);
	}
	private static void findPermutationIterative(char[] chars, int currentIndex) {
		String word = new String(chars);
		ArrayList<String> permuteList = new ArrayList<String>();
		permuteList.add(String.valueOf(word.charAt(0)));
		for (int i = 1; i < word.length(); i++) {
			for (int j = permuteList.size() - 1; j >= 0; j--) {
				String currentString = permuteList.remove(j);
				for (int k = 0; k <= currentString.length(); k++) {
					permuteList.add(
							currentString.substring(0, k) + word.charAt(i) + currentString.substring(k));
				}

			}
			if (word == null || word.length() == 0) {
				return;
			}
		}
		System.out.println(permuteList);
	}
		private static void findPermutationRecursive(char[] chars, int currentIndex) {
			if (currentIndex == chars.length - 1) {
				System.out.println(String.valueOf(chars));
			}

			for (int i = currentIndex; i < chars.length; i++) {
				swap(chars, currentIndex, i);
				findPermutationRecursive(chars, currentIndex + 1);
				swap(chars, currentIndex, i);
			}
		}
		

	private static void swap(char[] eachLetter, int first, int second) {
		char temp = eachLetter[first];
		eachLetter[first] = eachLetter[second];
		eachLetter[second] = temp;
	}

}
