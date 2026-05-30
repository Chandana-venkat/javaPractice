////package practiceproblems;
////
////public class Swapping2numbers {
////    public static void main(String[] args) {
////        int a = 10, b = 20;
////
////        System.out.println("Before Swapping values are .. " + a + "  " + b); 
////
////        // Logic - Third variable
////        int t = a;
////        a = b;
////        b = t;
////
////        System.out.println("After Swapping values are .. " + a + "  " + b); 
////    }
////}
//
////insertion sort
////package practiceproblems;
////
////public class Swapping2numbers {
////public static void main(String[]args) {
////	int arr[]= {5,6,2,3,1,8,4};
////	for(int i=1;i<arr.length;i++) {
////		int key=arr[i];
////		int j=i-1;
////		while(j>=0 && arr[j]>key) {
////			arr[j+1]=arr[j];
////			j--;
////			}
////		arr[j+1]=key;
////	}
////	 for(int num :arr)
////	 {
////		 System.out.println(num+ " ");
////	 }
////			
////	}
////}
//
// package practiceproblems;
//
//public class Swapping2numbers {
//public static void main(String[]args) {
//if(low<high)
//{
//	int pi=partition((arr,low,high);
//	
//}

package practiceproblems;

import java.util.Arrays;

import target.String;

//public class Swapping2numbers {
//	double salary=78.90;
//	static String school="navodhya";
//	public static void main(String[] args) {
//		//local variable
//		int age=90;
//		System.out.println("my age is"+age);
//		System.out.println("schoolname: "+Swapping2numbers.school);
//		//object creation
//		Swapping2numbers d= new Swapping2numbers();
//		System.out.println("my salary is:"+d.salary); 
//		
//		}
//}

//import java.util.Scanner;
//public class Swapping2numbers{
//	public static void main(String[] args){
//		Scanner sc= new Scanner(System.in);
//		
//		int arr[]= {12,89,37,81,73};
//		int position=2;
//		int element=77;
//		int newArr[]=new int[arr.length+1];
//		for(int i=0;i<position;i++) {
//			newArr[i]=arr[i];
//			
//			}
//		newArr[position]=element;
//		for(int i=0;i<arr.length;i++) {
//			newArr[position+1]=arr[i];
//		}
//		for(int el:newArr) {
//			System.out.println(el+ " ");
//		}
//		
//	}
//}

//public class Swapping2numbers{
//	public static void main(String[] args) {
//		int arr[]= {12,89,37,81,73};
//		int position=3;
//		int newArr[]=new int[arr.length-1];
//		int j=0;
//		for(int i=0;i<arr.length;i++) {
//			if(i==position) {
//				continue;// skip that value 
//				
//			}
//			newArr[j]=arr[i];
//			j++;
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//			
//		}
//	}
//}
//update
//public class Swapping2numbers{
// public static void updateEle(int[] arr,int size,int position,int newVal) {
//	 if(position<0 || position>=size) {
//		 System.out.println("invalid position");
//	 }
//	 else {
//		 arr[position]=newVal;
//		 System.out.println("updated element:"+position+" "+newVal);
//	 }
//	}
//		public static void main(String[] args) {
//			int arr[]= {12,89,45};
//			Swapping2numbers.updateEle(arr,3,1,22);
//			System.out.println(Arrays.toString(arr));
//		}
//	}


//public class Swapping2numbers{
//	public static void main(String[]args) {
//		int arr[]= {1,2,3,4,5};
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]%2 == 1) {
//				arr[i]=0;
//				}
//		}
//			for(int i=0;i<arr.length;i++) {
//				System.out.println(arr[i] +" ");
//				
//				}
//		 }
//			
//	   }
	


import java.util.Arrays;


public class rev_array {
    public static void main(String[] args) {

        int cpy[] = {1,2,3,4,6,7,8};

        int[] nwarr = Arrays.copyOfRange(cpy, 3, 7);
        System.out.println("new array is: " + Arrays.toString(nwarr));

        int fnew[] = new int[5];
        Arrays.fill(fnew, 8);
        System.out.println("New array: " + Arrays.toString(fnew));
    }
}













