package com.bridgelabz.com;
import java.util.*;
public class MergeSort {
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter the number of words to be added");
	    	int size=sc.nextInt();
	    	String[] wordArr=new String[size];
	    	System.out.println("ENTER THE WORDS NOW");
	        for(int i=0;i<size;i++)
	        {
	        	String word=sc.next();
	        	wordArr[i]=word;
	        }
	            String[] sortedArray = mergeSort(wordArr);
	            for (int i = 0; i < sortedArray.length; i++) {
	            System.out.println(sortedArray[i] + " ");
	            }

	    }
	    public static String[] mergeSort(String[] list) {
	        String [] sorted = new String[list.length];
	        if (list.length == 1) {
	            sorted = list;
	        } else {
	            int mid = list.length/2;
	            String[] left = null; 
	            String[] right = null;
	            if ((list.length % 2) == 0) {
	                left = new String[list.length/2];
	                right = new String[list.length/2];
	            } else { 
	                left = new String[list.length/2];
	                right = new String[(list.length/2)+1];
	            }
	            int x=0;
	            int y=0;
	            for (;x < mid; x++) {
	                left[x] = list[x];
	            }
	            for (;x < list.length; x++) {
	                right[y++] = list[x];
	            }
	            left = mergeSort(left);
	            right = mergeSort(right);
	            sorted = mergeArray(left,right);
	        }

	        return sorted;
	    }

	    private static String[] mergeArray(String[] left, String[] right) {
	        String[] merged = new String[left.length+right.length];
	        int leftIndex = 0;
	        int rightIndex = 0;
	        int mIndex = 0;
	        int comp = 0;
	        while (leftIndex < left.length || rightIndex < right.length) {
	            if (leftIndex == left.length) {
	                merged[mIndex++] = right[rightIndex++];
	            } else if (rightIndex == right.length) {
	                merged[mIndex++] = left[leftIndex++];
	            } else {  
	                comp = left[leftIndex].compareTo(right[rightIndex]);
	                if (comp > 0) {
	                    merged[mIndex++] = right[rightIndex++];
	                } else if (comp < 0) {
	                    merged[mIndex++] = left[leftIndex++];
	                } else { 
	                    merged[mIndex++] = left[leftIndex++];
	                }
	            }   
	        }
	        return merged;
	    }


	}

