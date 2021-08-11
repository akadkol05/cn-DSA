package loop;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean divided=false;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				divided=true;
				break;
			}
		}
		if(divided) {
			System.out.println("Not Prime number");
		}else {
			System.out.println("Prime number");
		}

	}

}
