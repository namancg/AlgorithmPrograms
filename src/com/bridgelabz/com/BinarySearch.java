package com.bridgelabz.com;
import java.util.Arrays;
public class BinarySearch {

	public static int binarySearch(String[] a, String x) {
        int low = 0;
        int high = a.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid].compareTo(x) < 0) {
                low = mid + 1;
            } else if (a[mid].compareTo(x) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }


		 public static void main(String args[]){  
			 String array[] ={"HELLO","EVERYONE","WELCOME","TO","PERFIOS","HAVE","A","GREAT","DAY \n "};
			 Arrays.sort(array);
		     for(int i=0;i<array.length;i++)
		        {
		        	System.out.println(array[i]);
		        }
		     String search = "TO";
		     int index = binarySearch(array,search);
		     if(index==-1)
		     {
		    	 System.out.println(search+" NOT FOUND");
		     }
		     else
		     System.out.println(search+" is found at: "+index);
		     
		 }  

}
