package com.bridgelabz.com;

import java.util.*;

public class InsertionSort {
	public static void main(String[] args){
		String[] array ={"HELLO","EVERYONE","WELCOME","TO","PERFIOS","HAVE","A","GREAT","DAY"};
		int count = 0;
		Arrays.sort(array);
		for(int i=0;i<array.length;i++){
		System.out.println(array[i]);
		}
		}

		public static<T extends Comparable<T>> void insertionsort(T[] array)
		{
			int i=0;
			T temp=array[i];
			int f=0;
			for( i=0;i<f;i++)
			{
				for(int j=i+1;j<f;j++)
					{
						if(array[i].compareTo(array[j])>0)
						{
							temp = array[i];
							array[i]=array[j];
							array[j]=temp;
						}
					}
			}
		printArray(array);
		}
		public static <T> void printArray(T[] array)
		{
			int size= array.length;
			for(int i=0;i<size;i++)
			{
				System.out.println(array[i]);
			}
		}

}
