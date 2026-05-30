package practiceproblems;

public class Armstrong {
	public static void main(String[] args) {

	int num = 1325;
	int temp = num, sum = 0;

	while (temp > 0) {
	    int rem = temp % 10;
	    sum += rem * rem * rem;
	    temp /= 10;
	}

	if (sum == num){
	    System.out.println("Armstrong");}
	else
	    System.out.println("Not Armstrong");
     }
}
