package practiceproblems;

import java.util.Scanner;

public class minmaxnumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		  int[] arr = new int[5];
	        System.out.println("Enter 5 numbers:");

	        for(int i = 0; i < arr.length; i++) {
	            arr[i] = s.nextInt();
	        }

	        int max = arr[0];
	        int min = arr[0];

	        for(int i = 1; i < arr.length; i++) {
	            if(arr[i] > max) {
	                max = arr[i];
	            }

	            if(arr[i] < min) {
	                min = arr[i];
	            }
	        }

	        System.out.println("Largest element: " + max);
	        System.out.println("Smallest element: " + min);
	    }
	}