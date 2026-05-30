//package practiceclass;
//
//public class rev_array {
//	public static void main(String[] args) {
//		int arr[]= {1,2,3,4}; //arr.length -1 for reverse
//		System.out.println("reverse array is : ");
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.println(arr[i]+ " ");
//			
//		}
//	}
//
//}

//16/4/26
//find the max element even array
//package practiceclass;
//public class rev_array{
//	public static void main(String[] args) {
//	int arr[]= {1,2,3,4};
//	int max=0;
//	for(int i=0;i<arr.length;i++) {
//		if(arr[i]>max) {
//		  max=arr[i];
//		}
//	}
//	System.out.println("max element: "+max);
//  }	
//}
//package target;
//public class rev_array{
// public static int findmax(int[] arr){
//	 int max=arr[0];
//	 for(int i=0;i<arr.length;i++) {
//		 if(arr[i]>max) {
//			 max=arr[i];
//			 
//		 }
//	 
//	 }
//	 return max;
// }
// public static void main(String [] args) {
//	 int arr[] = {12,89,37,28,19,93};
//	 //callimh method to find maxumum
//	 System.out.println("Maximum element :"+rev_array.findmax(arr));
//  }
//}
//package target;
//public class rev_array{
// public static int findmin(int[] arr){
//	 int min=arr[0];
//	 for(int i=0;i<arr.length;i++) {
//		 if(arr[i]<min) {
//			 min=arr[i];
//		 }
//	 }
//	 return min;
// }
// public static void main(String [] args) {
//	 int arr[]= {12,89,37,28,19,93};
//	 System.out.println("Minimum element :"+rev_array.findmin(arr));
//  }
//}
//package practiceclass;
//public class rev_array{
//	 public static void main(String [] args) {
//		int arr[] = {12,89,37,28,19,93};
//		int min=arr[0];
//		int max=arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//		}
//		System.out.println(min +" "+max);
//System.out.println(max);
//	 }
//}

//package practiceclass;
//public class rev_array{
//	public static void main(String[] args) {
//		int arr [] []= {{12,89,45},{23,83,29},{73,98,74}};//remove 45
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) { //to find length for jagged array
//				System.out.print(arr[i][j]+ " "); //ln 12
//			}                                       // 89 we want row so that only print
//			System.out.println();
//		}
//	}
//}

//12 89
//23 83 29
//73 98 74

//count how many elements equal to the minium value in the array; means {2,1,3,4,1,6,1} so 1=3mininum count
//package practiceclass;
//public class rev_array{
//	public static void main(String[] args) {
//		int arr[]= {1,45,12,16,1,12};
//		int min=arr[0];
//		int count=1;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<min) {
//				min=arr[i];
//				count=1;
//			//for (int j=0;j<arr.length-1;j--)
//		     }
//			else if(arr[i]==min){
//				count++;
//			}
//	}
//		System.out.println("min  "+ min);	
//		System.out.println("count: " + count);
//			
//		}
//		
//}

//find min and max index(not value) ie return the position where the min/max occur
//package practiceclass;
//public class rev_array{
//	public static void main(String[] args) {
//		int arr[]= {1,45,12,16,1,12};
//		int minindex=0;
//		int maxindex=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<arr[minindex]) {
//				minindex=i;
//				
//			}
//			if(arr[i]>arr[maxindex]);
//			maxindex=i;
//		}
//		
//		System.out.println("Min index: " +minindex );
//		System.out.println("maxindex: " +maxindex);
//		
//	}
//}

//package practiceclass;
//import java.util.Arrays;
//
//public class rev_array {
//   public static void main(String[] args){
//	     int cpy[]= {1,2,3,4,6,7,8};
//		//System.out.println(Arrays.toString(nwarr));
//		//copy of range(arr,fi,li) based on the range;
//		int[] nwarr=Arrays.copyOfRange(cpy, 3, 17);
//		System.out.println("new array is :" +Arrays.toString(nwarr));
//		//fill specified values inside array
//		int fnew[]=new int[5];
//		Arrays.fill(fnew, 8);
//		System.out.println("New array: "+Arrays.toString(fnew));
//		
//	}
//}
//package practiceclass;
//import java.util.Arrays;
//
//
//public class rev_array{
//    public static void main(String[] args) {
//
//        int cpy[] = {1,2,3,4,6,7,8};
//
//        int[] nwarr = Arrays.copyOfRange(cpy, 3, 7);
//        System.out.println("new array is: " + Arrays.toString(nwarr));
//
//        int fnew[] = new int[5];
//        Arrays.fill(fnew, 8);
//        System.out.println("New array: " + Arrays.toString(fnew));
//    }
//}

//package practiceclass;
//import java.util.HashSet;
////
//public class rev_array {
//    public static void main(String[] args) {
//
//        int arr[] = {2,3,4,5,5,6,6};
//        HashSet<Integer> set = new HashSet<>();
//
//        int k = 0;
//
//        for(int i = 0; i < arr.length; i++) {
//            if(!set.contains(arr[i])) {
//                set.add(arr[i]);
//                arr[k] = arr[i];
//                k++;
//            }
//        }
//
//        System.out.print("After removing duplicates: ");
//        for(int i = 0; i < k; i++) {w
//            System.out.print(arr[i] + " ");
//        }
//    }
//}	   

//package practiceclass;	   
//	public class rev_array{
//		public static int[] insertfront(int arr[],int element,int size) {
//			
//			for(int i= size-1;i>=0;i--) {
//				arr[i+1]=arr[i];
//				
//				
//			}
//			arr[0]=element;
//			return arr;
//			
//		}
//		public static void main(String[] args) {
//			int cap=10;
//			int arr[]= new int[cap];
//			int size=0;
//		    arr = insertfront(arr, 10, size++);
//		    arr = insertfront(arr, 20, size++);
//		    arr = insertfront(arr, 30, size++);
//
//		        // print result
//		    for (int i = 0; i < size; i++) {
//		            System.out.print(arr[i] + " ");
//		        }
//		    }
//		
//		}
//unresolved package problem when you not insert an element	
//package practiceclass;
//public class rev_array{
//	public static void main(String[] args){
//		int arr[]= {1,2,-3,4,-5,6};
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<0) {
//				arr[i]=-arr[i];
//			}
//		}
//		for(int num:arr) {
//			System.out.println(num + " ");
//		}
//	}
//} 
//output 1,2,3,4,5,6
//package practiceclass;
//public class rev_array{
//	public static void main(String[] args) {
//		int arr[]= {1,2,3,4,5};
//		int last= arr[arr.length-1];
//		for(int i=arr.length-1;i>0;i--) {
//			arr[i]=arr[i-1];
//			
//		}
//		arr[0]=last;
//		for(int num:arr) {
//			System.out.print(num + " ");
//		}
//	}
//}
//output 5 1 2 3 4 

//SetAll method set the all the elements in the array using the  provider generator function
//package practiceclass;

//import java.util.Arrays;

//import java.util.Arrays;
//public class rev_array{
//	public static void main(String[] args) {
//		int [] num= new int[5];
//		Arrays.setAll(num, i->i+1);
//		System.out.println(Arrays.toString(num));
//	}
//		
//}	

//parallelsort
//sorts the specified array int he ascending order
//public class rev_array{
//	public static void main(String [] args) {
//		int num[]= {5,3,8,1,2};
//		Arrays.parallelSort(num);
//		System.out.println(Arrays. toString(num));
//		
//	}
//	
//}
//output [1, 2, 3, 5, 8]

//package practiceclass;
//import java.util.Arrays;
//public abstract class rev_array{
//	public static void updateele(int[] arr,int size,int position,int newvalue) {
//	
//		if(position<0 || position>=size) {
//			System.out.println("invalid position");
//		}
//		else {
//			arr[position]=newvalue;
//			System.out.println("updated ele :" +position+ " " +newvalue);
//		}
//	}
//    public static void main(String[] args) {
//	   int arr[]= {12,89,45};
//	   rev_array.updateele(arr,3,1,22);
//	   System.out.println(Arrays.toString(arr));
//	   
//		}
//}

//package practiceclass;
//import java.util.Arrays;
//public abstract class rev_array{
//	int arr[]= {12,89,37,81,73};
//	int position=2;
//	int element=77;
//	int[] newArr=new int[arr.length+1];
//	for(int i=0;i<position;i++) {
//		newArr[i]=arr[i];
//	}
//	newArr[position]=element;
//	 for(int i=position;i<arr.length;i++}{
//		 newArr[position+1]=arr[i];
//	 }
//	  for(int :newArr) {
//		  System.out.println(el + " ");
//	  }
//	}
//}	  

//package practiceclass;
//import java.util.Arrays;
//public class rev_array {
//    public static void main(String[] args) {
//        int arr[] = {12, 89, 37, 81, 73};
//        int position = 2;
//        int element = 77;
//
//        int[] newArr = new int[arr.length + 1];
//
//        // copy before position
//        for(int i = 0; i < position; i++) {
//            newArr[i] = arr[i];
//        }
//
//        // insert element
//        newArr[position] = element;
//
//        // copy remaining elements
//        for(int i = position; i < arr.length; i++) {
//            newArr[i + 1] = arr[i];
//        }
//
//        // print array
//        for(int el : newArr) {
//            System.out.print(el + " ");
//        }
//    }
//}
//
//package practiceclass;
//public class rev_array{
//	public static void main(String [] args) {
//		int arr[]= {12,89,77,37,81,73};
//		int position=2;
//		int[] newArr=new int[arr.length -1] ;
//		for(int i=0,j=0;i<arr.length;i++) {
//			if(i==position) {
//				continue;  //skip 77
//			}
//			newArr[j++]=arr[i];
//			}
//		
//		for(int el :newArr) {
//			System.out.print(el + " ");
//		}
//	
//	  }
//	}

//tower of hanoi
//package practiceclass;
//import java.util.*;
//public class rev_array{
//	public static void main(String [] args) {
//		int n=3;
//		hanoi(n,'A','C','B');
//	}
//	public static void hanoi(int n,char from,char to,char aux) {
//		if(n==0)return;
//		hanoi(n-1,from,aux,to);
//		System.out.println("move disk" + n + " from " + from + " to " +to);
//		hanoi(n-1,aux,to,from);
//	    }
//} 

//sumArray elements

//package practiceclass;
//import java.util.Arrays;
//public class rev_array{
//	public static void main(String [] args) {
//		int [] arr= {1,2,3,4,5};
//		revArray(arr ,0,arr.length-1);
//		System.out.println(Arrays.toString(arr));
//		
//	}
//	public static void revArray(int [] arr, int left, int right) {
//	if(left>=right)return;
//	int temp = arr[left];
//	arr[left]=arr[right];
//	arr[right]=temp;
//	revArray(arr,left+1,right-1);
//}
//	
//}

//5,4,3,2,1

//first swap 0 and 4 index
//next focus on 2,3,4
//then swap index 1 and 3
//then middle 2,2 stop it

//package practiceclass;
//public class rev_array{
//	public static int search(int[] arr,int target) {
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==target) {
//				return i;
//				
//			}
//		}
//		return-1;
//	}
//	public static void main(String[] args) {
//		int arr1[]= {12,89,37,29,94,27};
//		int target1=299;
//		int pos=search(arr1,target1);
//		 if(pos!=-1) {
//			 System.out.println("ele found :" +1);
//			 
//		 }
//		 else {
//			 System.out.println("ele not found");
//		 }
//	}
//}	

//package practiceclass;
//public class rev_array{
//	public static void main(String[] args) {
//		String names[]= {"bahu","bali","sanju","sodi"};
//		String target="bahu";
//		boolean found =false;
//		for(String obj:names) {
//			if(obj.equals(target)) {
//				found=true;
//				break;
//				
//			}
//		}
//		System.out.println(found ? "found": "notfound");
//	}
//}

//package practiceclass;
//public class rev_array{
//	public static int search(int[] arr,int target);
//	int low=0;
//	int high=arr.length-1;
//	while(low<=high) {
//		int mid =(low+high)/2;
//		if(arr[mid]==target){
//			return mid;                         //e
//		}
//		else if(arr[mid]<target) {
//			low=mid+1;
//			
//		}else {
//			high=mid-1;
//		}
//	}
//	return -1;
//}
//public static void main(String [] args) {
//	int arr= {12,13,14,15,17,18,19};
//	int target=17;
//	System.out.println(search(arr,target));
//}
//package practiceclass;
//public class rev_array{
//	public static void main(String[] args) {
//		int arr[]= {1,2,3,4,5,6,7,8,9};
//		int target=6;
//		int low=0;
//		int high =arr.length-1;
//		while(low>high) {
//			int mid=(low+high)/2;
//			if(arr[mid]==target) {
//				System.out.println("found ele :"+mid);
//				return;
//			}else if(arr[mid]<target) {
//				low=mid+1;
//				
//			}else {
//				high=mid-1;
//			}
//		}
//	}
//}

//package practiceclass;
//public class rev_array {
//
//    public static int binarySearch(int[] arr, int left, int right, int target) {
//        // Base case: element not found
//        if (left > right) {
//            return -1;
//        }
//
//        // Find middle index
//        int mid = left + (right - left) / 2;
//
//        // If element is found
//        if (arr[mid] == target) {
//            return mid;
//        }
//
//        // If target is smaller, search left half
//        if (target < arr[mid]) {
//            return binarySearch(arr, left, mid - 1, target);
//        }
//
//        // If target is greater, search right half
//        return binarySearch(arr, mid + 1, right, target);
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {2, 5, 8, 12, 16, 23, 38};
//        int target = 16;
//
//        int result = binarySearch(arr, 0, arr.length - 1, target);
//
//        if (result != -1) {
//            System.out.println("Element found at index: " + result);
//        } else {
//            System.out.println("Element not found");
//        }
//    }
//}

//package practiceclass;
//public class rev_array{
//	public static int secondLargest(int arr[]) {
//	int largest=Integer.MIN_VALUE;
//	int secondLargest=Integer.MAX_VALUE;
//	for(int value:arr) {
//		if(value>largest) {
//			secondLargest=largest;
//			largest=value;
//		}
//		else {
//			if(value>secondLargest && value!=largest) {
//				secondLargest=value;
//			}
//			
//		}
//			
//		}
//	return secondLargest;
//	}
//	public static void main(String[] args) {
//		int arr[]= {12,13,14,15,78};
//		System.out.println(secondLargest(arr));
//	}
//}

//package practiceclass;
//public class rev_array{
//	public static int secondLargest(int arr[]) {
//	int largest=Integer.MAX_VALUE;
//	int secondLargest=Integer.MAX_VALUE;
//	for(int value:arr) {
//		if(value<largest) {
//			secondLargest=largest;
//			largest=value;
//		}
//		else {
//			if(value<secondLargest && value!=largest) {
//				secondLargest=value;
//			}
//			
//		}
//			
//		}
//	return secondLargest;
//	}
//	public static void main(String[] args) {
//		int arr[]= {10,12,13,14,15};
//		System.out.println(secondLargest(arr));
//	}
//}
//package practiceclass;
//
//import java.util.Arrays;
//
//public class rev_array{
//		public static void rotationleftbyk(int arr[],int k) {
//			k=k%arr.length;
//			reverse(arr,0,arr.length-1);
//			reverse(arr,0,arr.length-k-1);
//			reverse(arr,arr.length-k,arr.length-1);
//				
//			}
//				private static void reverse(int[] arr, int start, int end) {
//			// TODO Auto-generated method stub
//			          while(start<end) {
//						int temp=arr[start];
//						arr[start]=arr[end];
//						arr[end]=temp;
//						start++;
//						end--;
//				}
//		}
//				public static void main(String[] args) {
//					int arr[]= {1,2,3,4,5};				
//					rotationleftbyk(arr,3);
//					System.out.println(Arrays.toString(arr));
//		
//	}
//}

// package practiceclass;
// public class rev_array{
//	 public static void main(String[] args) {
//		int[][] arr= {{12,89,45},{28,83,29},{73,98,74}};
//		for(int i=0;i<arr.length;i++) {
//			int rowsum=0;
//			for(int j=0;j<arr.length;j++) {
//				rowsum+=rowsum+arr[i][j];
//			System.out.println(arr[i][j]+ " ");
//		}
//	}
//	 System.out.println("rowsum = " + rowsum);
//	}
// }

// package practiceclass;
//
// public class rev_array {
//     public static void main(String[] args) {
//
//         int[][] arr = {{12,89,45},{28,83,29},{73,98,74}};
//
//         for(int i = 0; i < arr.length; i++) {
//             int rowsum = 0;
//
//             for(int j = 0; j < arr[i].length; j++) {
//                 rowsum += arr[i][j];
//                 System.out.print(arr[i][j] + " ");
//             }
//
//             System.out.println(" -> rowsum = " + rowsum);
//         }
//     }
// }

//package practiceclass;
//public class rev_array {
//    public static void main(String[] args) {
//        int[][] matrix = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//        };
//
//        int n = matrix.length;
//
//        System.out.println("Primary Diagonal:");
//        for (int i = 0; i < n; i++) {
//            System.out.print(matrix[i][i] + " ");
//        }
//    }
//   
//	}

//package practiceclass;
//public class rev_array{
//	public static void main(String[] args) {
//		int [][] matrix= {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9}};
//		int maxSum=Integer.MIN_VALUE;
//		int maxRowIndex=-1;
//		for(int i=0;i<arr.length;i++) {
//			int rowSum=0;
//			for(int j=0;j<arr[i].length;j++) {
//				
//			}
//			
//			
//		}
//	}
//}


//23/4/26
//package practiceclass;
//public class rev_array{
//	public static int binary(String []args) {
//		int arr[]= {12,18,19,20,22};
//		int target=19;
//		int left=0;
//		int right=arr.length-1;
//		while(left<right) {
//			int mid=(left+right)/2;
//			if(arr[mid]==target)
//			{
//				System.out.println("found ele :"+mid);
//				return mid ;
//			}else if(arr[mid]<target) {
//				return left=mid+1;
//			}
//			else {
//				return right=mid-1;
//				
//			}
//			public static void main(String[]args) {
//				System.out.println("found ele: ");
//			}
//		}
//	}
//}	


//binarysearch
package practiceclass;

public class rev_array {

    public static int binary() {
        int arr[] = {12, 18, 19, 20, 22};
        int target = 19;

        int left = 0;
        int right = arr.length - 1;

       while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
              System.out.println("Found element at index: " + mid);
               return mid;
           } else if (arr[mid] < target) {
               left = mid + 1;
            } else {
               right = mid - 1;
            }
        }

       return -1; // if not found
   }

}  
//				
//package practiceclass;
//
//public class rev_array {
//	public static void main(String[] args) {
//		String names[] = { "soma", "sanju", "eliya" };
//		String target = "soma";
//		int left = 0;
//		int right = names.length - 1;
//		while (left <= right) {
//			int mid = (left + right) / 2;
//			int cmp = names[mid].compareTo(target);
//			if (cmp == 0) {
//				System.out.println("entered");
//				System.out.println("found at:  " + mid);
//				return;
//
//			} else if (cmp < 0) {
//
//				left = mid + 1;
//			} else {
//				right = mid - 1;
//			}
//			System.out.println("element not found");
//
//		}
//
//	}
//}
