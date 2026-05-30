//package practiceclass;
//import java.util.Scanner;
//public class Inserting {
//public static void main(String[] args) {
//				Scanner sc= new Scanner(System.in);
//				int n=0;
//				int arr[]= {12,89,37,81,73};
//				int position=2;
//				int element=77;
//				int newArr[]=new int[arr.length+1];
//				for(int i=0;i<position;i++) {
//					newArr[i]=arr[i];
//					
//					}
//				newArr[position]=element;
//				for(int i=position;i<arr.length;i++) {
//					newArr[position+1]=arr[i];
//				}
//				for(int el:newArr) {
//					System.out.println(el+ " ");
//				}
//				
//			}
//		}
//package practiceclass;
//import java.util.Arrays;
//
//
//
//public class Inserting{
//	public static void main(String[] args) {
//		int [] srt= {56,92,63,91};
//		//sort the array
//		Arrays.sort(srt);
//		System.out.println(Arrays.toString(srt));
//		
//		
//		//search an element in array
//		int srch[]= {2,3,4,5,6};
//		int index=Arrays.binarySearch(srch, 5);
//		System.out.println("index location is :"+index);
//		//chexk both arrays are eqaul or not
//		int arr1[]= {1,2,3,4};
//		int arr2[]= {1,2,3,4};
//		boolean isEqual=Arrays.equals(arr1, arr2);
//		System.out.println("equal or no: "+isEqual);
//		//copy the values into array task 1
//		int cpy[]= {1,2,3,4,7};
//		int[] newarr=Arrays.copyOf(cpy, 10);
//		System.out.println(Arrays.toString(newarr));
//		
//	}
//}
//package practiceclass;



//package practiceclass;
//public class Inserting {
//	public static int sumDemo(int n) {
//		if(n==0) {
//			return 0;
//		}
//		return n%10+sumDemo(n/10);
//		
//	}
//	public static void main(String[] args) {
//		System.out.println(sumDemo(123411));
//	}
//}

//output 12
//package practiceclass;
//
//public class Inserting {
//    public static int fiborec(int n) {   // ❗ removed ;
//        if(n <= 1) {
//            return n;
//        }
//        return fiborec(n - 1) + fiborec(n - 2);
//    }
//
//    public static void main(String[] args) {
//    
//        System.out.println(fiborec(5));
//    }
//}


//package practiceclass;
//public class Inserting {
//	public void display() {
//		System.out.println("Sleeping");
//	}
//    public int sum(int a,int b) {
//    	System.out.println("addition of num: " +(a+b));
//    	 return a+b;
//    }
//    
//    public int sub(int a, int b) {
//    	System.out.println("Subtraction of num: " +(a-b));
//    	return a-b;
//    	 }
//public static void main(String [] args) {
//	Inserting md=new Inserting();
//	md.display();
//	md.sum(12, 13);
//	md.sub(12, 13);
//	System.out.println(md.sub(13, 10));
//	}
//}

 //normal factorial 
//package practiceclass;
//public class Inserting{
//	public static int fact(int n){
//		int res=1;
//		 for(int i=2;i<=n;i++) {
//			 res=res*i;
//		 }
//		 return res;
//      }
//		 public static void main(String[] args) {
//			 System.out.println(fact(5));
//		 }
//	}

//package practiceclass;
//public class Inserting{
//	public static int factrec(int n)
//	{
//		 if(n<1) {
//			 return 1;
//		 }
//		 return n*factrec(n-1);//recusive logic
//      }
//		 public static void main(String[] args) {
//			 System.out.println(factrec(5));
//		 }
//	}

//package practiceclass;
//public class Inserting{
//	public static int fiboItr(int n)
//	{
//		 if(n<=1) {
//			return n;
//		 }
//		int a=0;
//		int b=1;
//		int c=0;
//		for(int i=2;i<=n;i++) {
//         c=a+b;
//         a=b;
//         b=c;
//		}
//	      return c;
//	}
//	public static void main(String[] args) {
//		 
//			 System.out.println(fiboItr(5));
//		 }
//	}

//package practiceclass;
//
//public class Inserting {
//
//    public static int fiborec(int n) {   // ❗ removed ;
//        if(n <= 1) {
//            return n;
//        }
//        return fiborec(n - 1) + fiborec(n - 2);
//    }
//
//    public static void main(String[] args) {
//    
//        System.out.println(fiborec(5));
//    }
//}

//package practiceclass;
//public class Inserting{
//	public static void main(String[] args) {
//		int ages[] =new int[4]	;
//	     ages[0]=67;
//	     ages[1]=78;
//	     ages[2]=82;
//	     ages[3]=81;
//	     //ages[4]=91;
//	     System.out.println(ages[0]);
//	     System.out.println(ages[1]);
//	     System.out.println(ages[2]);
//	     System.out.println(ages[3]);
//	     System.out.println(ages[4]);
//	}
//}

//package practiceclass;
//public class Inserting{
//	public static void main(String[] args) {
//		int nums[]= {45,89,12,80};
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
//		System.out.println(nums[3]);
//		System.out.println(nums[4]);
//		System.out.println("====by using normal for loop===");
//		for(int i=0;i<4;i++) {
//			System.out.println(nums[i]);
//		}
//		int len=nums.length;
//		System.out.println("array length :"+len);
//		System.out.println("=====by using length property in for loop==");
//		for(int i=0;i<nums.length;i++) {
//			System.out.println(nums[i]);
//		}
//		 System.out.println("===by using enhanced for loop");
//		 for(int num: nums)
//		 {
//			 System.out.println(num);
//		 }
//		
//	}
//}





















































































































