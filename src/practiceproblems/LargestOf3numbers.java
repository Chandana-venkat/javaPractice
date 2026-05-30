//package practiceproblems;
//
//import java.util.Scanner;
//
//public class LargestOf3numbers {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		 int largest1 = a > b ? a : b; // largest of a & b
//	        int largest2 = c > largest1 ? c : largest1;
//	   	 System.out.println(largest2+"is Largest number");
//		
//		System.out.println("Enter the  First Number");
//		int a=sc.nextInt();
//		System.out.println("Enter Second number");
//		int b=sc.nextInt();
//		System.out.println("Enter the Third number");
//		int c=sc.nextInt();	
//
//		//Approach
//		if(a>b && a>c)
//		{
//			System.out.println(a+  " is Largest Number");
//			
//		}else if(b>a&&b>c) {
//			System.out.println(b+ "is Largest Number");
//		}else {
//			System.out.println(c+ "is Largest Number");
//		}



//package practiceproblems;
//
//import java.util.Scanner;
//
//public class LargestOf3numbers {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Taking input from user
//        System.out.print("Enter first number (a): ");
//        int a = sc.nextInt();
//
//        System.out.print("Enter second number (b): ");
//        int b = sc.nextInt();
//
//        System.out.print("Enter third number (c): ");
//        int c = sc.nextInt();
//
//        // Using ternary operator to find largest
////        int largest1 = a > b ? a : b; // Largest of a & b
////        int largest2 = c > largest1 ? c : largest1; // Largest among a, b, and c
//        
//        int Largest=c>(a>b?a:b)?c:(a>b?a:b);
//        System.out.println(Largest+ " is the largest number");
//
//        sc.close();
//    }
//}



























