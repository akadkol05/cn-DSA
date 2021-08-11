package loop;

import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++){
			int num=3*i+2;
			if(num%4!=0) {
				System.out.println(num+" ");
			}else {
				n++;
			}
		}

	}

}
