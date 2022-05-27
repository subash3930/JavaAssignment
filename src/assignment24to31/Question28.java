package assignment24to31;

public class Question28 {

	// Write a program in a single class having the following functions.
	// isPrimenumber(int)
	// firstNthPrime(int )
	// allPrimebetween(int start , int end)
	public static boolean isPrimenumber(int n) {
		if (n == 1 || n == 0)
			return false;
		for (int i = 2; i<n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;

	}
	public static void isNthprime(int num) {
		for (int j = 2; j <= num; j++) {
			if (isPrimenumber(j)) {
				System.out.println(j+" ");
			}
				
		}


	}
	public static void allPrimebetween(int start,int end) {
		for (int k = start; k <= end; k++) {
			if (isPrimenumber(k)) {
				System.out.println(k+" ");
			}
				
		}


	}
	

	public static void main(String[] args) {
		if(isPrimenumber(5)) {
			System.out.println("the number is prime");
		}else {
System.out.println("The number is not prime");
	}
	    isNthprime(5);
		allPrimebetween(5,10);
		

}}
