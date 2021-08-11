package loop;

import java.util.Scanner;

public class SumOrProduct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println("Enter the choice:");
		int c=sc.nextInt();
		
		int sum=0;
		int product=1;
		for(int i=1;i<=n;i++) {
		    	sum=sum+i;
		    	product=product*i;
		}
		if(c==1) {
	    
			System.out.println(sum+" ");
	   
	    }
	    if(c==2) {
	    	
	    	System.out.println(product+" ");
	    }

	}

}
