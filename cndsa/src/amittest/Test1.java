package amittest;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean palindrome=false;
		int reverse=0;
		int k=n;
		while(n!=0) {
			int digit=n%10;
			reverse=reverse*10+digit;
			n=n/10;
		}
		if(reverse==k) {
			palindrome=true;
			
		}
		System.out.println(palindrome);

	}

}
