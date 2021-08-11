package functions;

import java.util.Scanner;

public class SumofNum {
	public static void sum(int a,int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		sum(a,b);

	}

}
