package com.bridgelabz.com;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args){
		String[] array ={"HELLO","EVERYONE","WELCOME","TO","PERFIOS","HAVE","A","GREAT","DAY"};
		int count = 0;
		Arrays.sort(array);
		for(int i=0;i<array.length;i++){
		System.out.println(array[i]);
		}
		}

		public static String[] insertionsort(String array[]){
			String temp="";
			int f=0;
			for(int i=0;i<f;i++)
			{
				for(int j=i+1;j<f;j++)
					{
						if(array[i].compareToIgnoreCase(array[j])>0)
						{
							temp = array[i];
							array[i]=array[j];
							array[j]=temp;
						}
					}
			}
		return array;
		}

}
