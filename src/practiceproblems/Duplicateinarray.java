//package practiceproblems;
//
//import java.util.HashSet;
//
//public class Duplicateinarray {
//    public static void main(String[] args) {
       // String arr[] = {"java", "c", "c++", "python", "java"};
//        boolean flag = false;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i].equals(arr[j])) {
//                    System.out.println("Found duplicate element: " + arr[i]);
//                    flag = true;
//                }
//            }
//        }
//
//        if (!flag) {
//            System.out.println("No duplicate elements found.");
//        }
//    }
//}

	//approach2
      
//	package practiceproblems;
//
//import java.util.HashSet;
//
//public class Duplicateinarray {
//    public static void main(String[] args) {
//        HashSet<String> langs = new HashSet<>();
//        System.out.println(langs.add("java"));    // true
//        System.out.println(langs.add("Python"));  // true
//        System.out.println(langs.add("java"));    // false (duplicate)
//    }
//}
package practiceproblems;

import java.util.HashSet;



public class Duplicateinarray {
    public static void main(String[] args) {
 String arr[] = {"java", "c", "c++", "python", "java"};
 HashSet<String> langs = new HashSet<>();
 boolean flag=true;
 for(String l:arr)
 {
	 if(langs.add(l)==false) {
		 System.out.println("found duplicate element" +l);
		 flag=true;
	 }
	//System.out.println( langs.add(l));
	 
 }
 if(flag==false) {
	 System.out.println("nt found duplictaes");
 }
    }
}



























