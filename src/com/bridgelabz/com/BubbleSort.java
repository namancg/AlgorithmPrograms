package com.bridgelabz.com;

public class BubbleSort {

	public static void main(String args[])
    {
        Integer[] arr = {19,66,44,9,54,43,24,75,36,55,34};
        bubbleSort(arr);
        String[] stringArray= {"HELLO","WELCOME","TO","PERFIOS"};
        bubbleSort(stringArray);
       
    }
	public static<T extends Comparable<T>> void bubbleSort(T[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = i; j < n; j++)
                if (arr[i].compareTo(arr[j]) < 0)
                {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
        System.out.println("AFTER SORTING");
        for( int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }
    }
}
