package practiceproblems;

public class Missingnumberinarray {
	public static void main(String[] args) {
	int a[]= {1,2,4,5};
	int sum1=0;
	for(int i=0;i<a.length;i++) {
		sum1=sum1+a[i];
	}
		System.out.println("sum of elements: "+sum1);
	
	int sum2=0;
	for(int i=0;i<a.length;i++) {
		sum2=sum2+a[i];}
		System.out.println("sum of elements "+sum2);
		System.out.println("Missing number is "+(sum2-sum1));
	}
}

