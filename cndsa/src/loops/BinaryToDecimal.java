package loop;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int t=n;
		int i=0;
		int d=0;
		while(t>0) {
			int r=t%10;
			t=t/10;
			d=d+r*(int) Math.pow(2, i++);
		}
		System.out.println(d);

	}

}
