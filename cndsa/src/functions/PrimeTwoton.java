package functions;

public class PrimeTwoton {

	
public static boolean isPrime(int n) {
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
			return true;
	}
		
	public static void printprimes(int n) {
		for(int i=2;i<=n;i++) {
			boolean isPrimenum=isPrime(i);
			if(isPrimenum) {
			
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
	 printprimes(100);

	}

}
