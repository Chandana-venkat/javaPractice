//package practiceproblems;
//
//import java.util.Scanner;
//
//public class Palindrome {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Enter the number: ");
//        int num = s.nextInt();
//        int org_num = num;
//        int rev = 0;
//
//        while (num != 0) {
//            rev = rev * 10 + num % 10;
//            num = num / 10;
//        }
//
//        if (org_num == rev) {
//            System.out.println(org_num + " is a Palindrome Number");
//        } else {
//            System.out.println(org_num + " is not a Palindrome");
//        }
//
//        s.close();
//    }
//}



//for string
//package practiceproblems;
//
//import java.util.Scanner;
//
//public class Palindrome {
//    public static void main(String[] args) {
//       Scanner s=new Scanner(System.in);
//       System.out.println("Enter the String: ");
//       String str=s.next();
//       String rev="";
//        int len = str.length();
//        for (int i = len - 1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//        }
//        if (str.equals(rev)) {
//        System.out.println( str+"  Palindrome");
//        
//    }else {
//    System.out.println (str+"  Not Palindrome");
//
//}
//    }
//}

//package practiceproblems;
//public class Palindrome{
// public static void main(String[] args) {
//	 int num=123456;
//	 int count=0;
//	 while(num>0) {
//		 num=num/10;
//		 count++;
//		 
//	 }
//	 System.out.println("no: of digits "+count);
// }
//}

//Counting of numbers
//package practiceproblems;
//public class Palindrome{
//	public static void main(String[]args) {
//		int num=1234;
//		int even_count=0;
//		int odd_count=0;
//		while(num>0){
//			int rem=num%10;
//			if(rem%2==0){
//			even_count++;
//			} 
//			else {
//			 odd_count++;
//		}
//			num=num/10;
//		}
//		System.out.println("no: of even numbers:"+even_count);
//		System.out.println("no: of even numbers:"+odd_count);
//		
//	}
//}

package practiceproblems;
 public class Palindrome{
 void printEven(int n) {
 for(int i=0;i<n;i+=2) {
  System.out.print(i+ " ");
 }
 }
}










































