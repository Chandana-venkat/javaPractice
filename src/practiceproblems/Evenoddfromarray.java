package practiceproblems;

public class Evenoddfromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		System.out.println("Even numbers in array...");
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%2==0) 
//			System.out.println(a[i]);
//		}
		
		for(int value:a) {
			if(value%2==0)
				System.out.println(value);
		}
		System.out.println("Odd numbers in the array..");
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%2!=0) 
//			System.out.println(a[i]);
		for(int value : a) {
			if(value%2!=0)
				System.out.println(value);
		
		
			
		}
	}
}

	
