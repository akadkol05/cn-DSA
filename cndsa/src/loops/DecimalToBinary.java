package loops;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int t=n;
		String s=" ";
		while(t>0) {
			int r=t%2;
			t=t/2;
			s=r+s;
		}
		System.out.println(s);
	}

}
