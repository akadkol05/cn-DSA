package loop;

import java.util.Scanner;

public class NPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=2;i<=n;i++) {
			boolean divide=false;
			for(int j=2;j<i-1;j++) {
				if(i%j==0) {
					divide=true;
				}
			}
			if(!divide) {
				System.out.print(i+" ");
			}
		}
		

	}

}
 