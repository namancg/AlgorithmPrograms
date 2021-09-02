package com.bridgelabz.com;
import java.util.*;
public class MergeSort<T extends Comparable> {
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		MergeSort obj = new MergeSort();
		String[] inputArr= {"HELLO","EVERYONE","WELCOME","TO","PERFIOS","HAVE","A","GREAT","DAY"};
		System.out.println("Before performing merge sort: "+Arrays.toString(inputArr));
		obj.mergeSort(inputArr, 0, inputArr.length-1);
		System.out.println("After sorting: "+Arrays.toString(inputArr));
	}
	void merge(T arr[], int l, int m, int r) {
		int sizeOfLeft = m - l + 1;
		int sizeOfRight = r - m;
		T[] L = (T[]) new Comparable[sizeOfLeft];
		T[] R = (T[]) new Comparable[sizeOfRight];
		for (int LIndex = 0; LIndex < sizeOfLeft; ++LIndex)
			L[LIndex] = arr[l + LIndex];
		for (int RIndex = 0; RIndex < sizeOfRight; ++RIndex)
			R[RIndex] = arr[m + 1 + RIndex];
		int i = 0, j = 0;
		int k = l;
		while (i < sizeOfLeft && j < sizeOfRight) {
			if (L[i].compareTo(R[j]) <= 0) {
				arr[k] = L[i];
				i++;
			} 
			else 
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < sizeOfLeft) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < sizeOfRight) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	void mergeSort(T arr[], int l, int r) {
		if (l < r) 
		{
			int m = l + (r - l) / 2;
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}
	}

