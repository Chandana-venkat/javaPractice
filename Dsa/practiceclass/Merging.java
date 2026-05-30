//28/4/26
//mergeSort;

//package practiceclass;
//import java.util.Arrays;
//
//public class Merging {
//public static void mergeSort(int arr[],int noofEle) {
//		if(noofEle<2) {
//			return;
//		}
//		
//		int mid=noofEle/2;
//		int leftArr[]=new int[mid];
//		int rightArr[]=new int[noofEle-mid];
//		
//		for(int i=0;i<mid;i++) {
//			leftArr[i]=arr[i];
//			
//		}
//		for(int i=mid;i<noofEle;i++) {
//			rightArr[i-mid]=arr[i];
//		}
//		mergeSort(leftArr,mid);
//		mergeSort(rightArr,noofEle-mid);
//		merge(arr,leftArr, rightArr,mid,noofEle-mid);
//		
//	}
//
//
//	private static void merge(int[] arr, int[] leftArr, int[] rightArr, int left, int right) {
//		// TODO Auto-generated method stub
//		int i=0,j=0,k=0;
//		while(i<left && j<right) {
//			if(leftArr[i]<=rightArr[j]) {
//				arr[k++]=leftArr[i++];
//				
//			}else {
//				arr[k++]=rightArr[j++];
//			}
//			
//		}
//		while(i<left) {
//			arr[k++]=leftArr[i++];
//			
//		}
//		while(j<right) {
//			arr[k++]=rightArr[j++];
//		}
//	}
//	    public static void main(String[] args)
//	    {
//	    	int arr[]= {7,3,8,1,2,6,9,5};
//	    	mergeSort(arr,8);
//	    	System.out.print(Arrays.toString(arr));
//	    
//	    }
//	 }
//
//29/4/26
//panSort
//
//package practiceclass;
//import java.util.Arrays;
//
//public class Merging{
//	public static void flip(int arr[],int end) {
//		int start=0;
//		while(start<end){
//			int temp=arr[start];
//			arr[start]=arr[end];
//			arr[end]=temp;
//			start++;
//			end--;
//		}
//		System.out.println("after reverse :"+Arrays.toString(arr));
//	}
//	public static int findMax(int arr[],int n) {
//		int maxInd=0;
//		for(int i=1;i<n;i++) {
//			if(arr[i]>arr[maxInd]) {
//				maxInd=i;
//			}
//		}
//		return maxInd;
//	}
//	public static void pansortLogic(int arr[]) {
//		int n=arr.length;
//		for(int currentSize=n;currentSize>1;currentSize--) {
//			int maxIndex=findMax(arr,currentSize);
//			System.out.println("currentSize :"+currentSize);
//			System.out.println("\n maximum ele index : "+maxIndex);
//			
//			if(maxIndex!=0) {
//				flip(arr,maxIndex);
//				
//			}
//			flip(arr,currentSize-1);
//		}
//	}
//	public static void main(String[] args) {
//		int arr[]= {3,8,2,9,4,6,1,5};
//		System.out.println("before sort:"+Arrays.toString(arr));
//		pansortLogic(arr);
//		System.out.println("After Sort:"+Arrays.toString(arr));
//		
//	}
//}
//Tim Sort

package practiceclass;
import java.util.Arrays;
 public class Merging {
 static int RUN = 32;
 static void insertionSort(int arr[], int l, int r) {
        for(int i = l + 1; i <= r; i++) {
            int temp = arr[i];
            int j = i - 1;

            while(j >= l && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    static void merge(int arr[], int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        int a[] = new int[n1];
        int b[] = new int[n2];

        for(int i = 0; i < n1; i++)
            a[i] = arr[l + i];

        for(int i = 0; i < n2; i++)
            b[i] = arr[m + 1 + i];

        int i = 0, j = 0, k = l;

        while(i < n1 && j < n2) {
            if(a[i] < b[j]) {
                arr[k] = a[i];
                i++;
            } else {
                arr[k] = b[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            arr[k++] = a[i++];
        }

        while(j < n2) {
            arr[k++] = b[j++];
        }
    }

    static void timSort(int arr[], int n) {

        // insertion sort
        for(int i = 0; i < n; i += RUN) {
            int end = i + RUN - 1;
            if(end >= n)
                end = n - 1;

            insertionSort(arr, i, end);
        }

        // merge
        for(int size = RUN; size < n; size = size * 2) {

            for(int left = 0; left < n; left += 2 * size) {

                int mid = left + size - 1;
                int right = left + 2 * size - 1;

                if(right >= n)
                    right = n - 1;

                if(mid < right)
                    merge(arr, left, mid, right);
            }
        }
    }

    public static void main(String args[]) {

        int arr[] = {5, 2, 9, 1, 6, 3, 8, 4};

        System.out.println("Before: " + Arrays.toString(arr));

        timSort(arr, arr.length);

        System.out.println("After: " + Arrays.toString(arr));
    }
}






























