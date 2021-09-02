package com.bridgelabz.com;
import java.util.*;
public class BinarySearch<T extends Comparable<T>> {

	public int binarySearch(ArrayList<T> a, int low, int high, T searchWord) {
        int mid;
        while (low <= high) {
            mid = (low + (high-low)) / 2;
            if (a.get(mid).equals(searchWord)) {
                return mid;
            }  if (a.get(mid).compareTo(searchWord) > 0) {
                return binarySearch(a,low,mid-1,searchWord);
            } {
                return mid;
            }
        }
        return -1;
    }
	 public static void main(String args[]){  
		 	 Scanner sc=new Scanner(System.in);
		 	 BinarySearch<String> searchWord=new BinarySearch<String>();
		 	 ArrayList<String> array=new ArrayList<String>();
		 	 System.out.println("ENTER THE NUMBER OF WORDS");
		 	 int size=sc.nextInt();
		 	 System.out.print("ENTER THE WORDS");
		 	 for(int i=0;i<size;i++)
		 	 {
		 		 String word=sc.next();
		 		 array.add(word);
		 	 }
		 	 System.out.println("Enter the word to be searched");
		     String wordToBeSearched=sc.next();
		     int index=searchWord.binarySearch(array, 0, size-1, wordToBeSearched);
		     System.out.println("IS AT:"+index);
		     
		 }
	
	  

}
