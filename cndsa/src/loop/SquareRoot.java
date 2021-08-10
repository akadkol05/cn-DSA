package loop;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
//		int s=(int) Math.sqrt(n);
//		System.out.println(s);
		int ans=0;
		int start=1;
		
		while(start*start<=n) {
			ans=start;
			start++;
		
			}
		System.out.println(ans);
		
		

	}

}
