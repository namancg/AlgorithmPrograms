package com.bridgelabz.com;

public class BubbleSort {

	public static void main(String args[])
    {
        int arr[] = {19,66,44,9,54,43,24,75,36,55,34};
        bubbleSort(arr);
        System.out.println("Sorted array");
        for (int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }
    }
	public static int[] bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        return arr;
    }
}
