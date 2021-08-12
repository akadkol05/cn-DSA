package functions;

import java.util.Scanner;

public class FibonacciNumber {
	public static boolean check(int n) {
		int a=1;
		int b=1;
		for(int i=0;i<n;i++) {
			int c=a+b;
			a=b;
			b=c;
			if(c==n) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(check(n));

	}

}
