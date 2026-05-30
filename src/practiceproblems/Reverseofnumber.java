//package practiceproblems;
//
//import java.util.Scanner;
//
//public class Reverseofnumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();
//
//        // using algorithm
////        int rev = 0;
////        while (num != 0) {
////            rev = rev * 10 + num % 10;
////            num = num / 10;
////        }
////
////        StringBuffer sb=new StringBuffer(String.valueOf (num));
////        StringBuffer rev=sb.reverse();
//        
//        
//        StringBuilder sb1=new StringBuilder();
//        sb1.append(num);
//        StringBuilder rev=sb1.reverse();
//        System.out.println("Reverse Number is: " + rev);
//       
//    }
//}
//

// Abstract class
//package practiceproblems;
//abstract class Animal {
//    // Abstract method (no body)
//    abstract void makeSound();
//
//    // Regular method
//    void eat() {
//        System.out.println("Animal is eating");
//    }
//}
//
//// Subclass that implements abstract method
//class Dog extends Animal {
//    void makeSound() {
//        System.out.println("Dog barks");
//    }
//}
//
//public class Reverseofnumber {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.makeSound(); // Dog barks
//        d.eat();       // Animal is eating
//    }
//}
//
//package practiceproblems;
//public class Reverseofnumber {
//    public static void main(String[] args) {
//        int[] original = {1, 2, 3, 4};
//
//        // Clone the array
//        int[] copy = original.clone();
//
//        // Print both arrays
//        System.out.println("Original array:");
//        for (int i : original) System.out.print(i + " ");
//
//        System.out.println("\nCloned array:");
//        for (int i : copy) System.out.print(i + " ");
//    }
//}
//package practiceproblems;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Reverseofnumber {
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            
//            if (map.containsKey(complement)) {
//                return new int[] { map.get(complement), i };
//            }
//            
//            map.put(nums[i], i);
//        }
//        
//        return new int[] {}; // If no solution found
//    }
//}































