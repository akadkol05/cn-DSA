package loop;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number= ");
		int n=s.nextInt();
		
		int reverse=0;
		while(n!=0) {
			int digit=n%10;
			reverse=reverse*10+digit;
			n=n/10;
		}
		
		System.out.println("Reverse number is="+ " "+reverse);
		

	}

}
