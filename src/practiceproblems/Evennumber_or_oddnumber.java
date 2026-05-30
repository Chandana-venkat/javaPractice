//package practiceproblems;
//
//import java.util.Scanner;
//
//public class Evennumber_or_oddnumber {
//	public static void main(String []args) {
//	Scanner sc=new Scanner(System.in);
//	int m = sc.nextInt();
//	if(m % 2==0) {
//		System.out.println("even");
//		
//	}
//	else {
//		System.out.println("odd");
//	}
//
//}
//}
//package practiceproblems;

//import java.util.Scanner;
//
//public class Evennumber_or_oddnumber {
//	public static void main(String []args) {
//		Scanner sc= new Scanner(System.in) ;
//			int m=sc.nextInt();
//			if(m>85) {
//				System.out.println("first class");}
//			 else if(m==35) {
//					System.out.println("border_pass");
//				
//			 }
//				else if(m>70 && m<85) {
//							System.out.println("second class");}
//				else if(m>35 && m<70) {
//					System.out.println("third class");
//							
//				}else {
//					System.out.println("fail");
//				}
//				
//						}
//					}

					
				

package practiceproblems;

import java.util.Scanner;

public class Evennumber_or_oddnumber   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int m = sc.nextInt();

        if (m > 85) {
            System.out.println("First Class");
        } else if (m >= 70 && m <= 85) {
            System.out.println("Second Class");
        } else if (m > 35 && m < 70) {
            System.out.println("Third Class");
        } else if (m == 35) {
            System.out.println("Border Pass");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}

			
		
	