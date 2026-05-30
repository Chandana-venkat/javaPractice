package practiceproblems;

public class Minmaxelementinarray {
	public static void main(String[] args) {
//		int a[]= {50,10,40,20,60};
//		int max=a[0];
//		for(int i=1;i<a.length;i++) {
//			if(a[i]>max)
//			{
//				max=a[i];
//			}
//		}
//		System.out.println("Max element is array: "+max);
		int a[]= {50,100,40,20,60};
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			
				if(a[i]<min)
				{
					min=a[i];
				}
			}
		
			System.out.println("min element in array is: "+min);
		}
	}


