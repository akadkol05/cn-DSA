package loop;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        int b=1;
        int c=0;
        if(n==1) {
        	System.out.print(a);
        	
        }
        else if(n==2) {
        	System.out.print(a);
        }
        else {
//         	System.out.print(a+ " "+b +" ");
        
       for(int i=2;i<n;i++) {
    	   c=a+b;
    	   a=b;
    	   b=c;
    	  
       }
       System.out.print(c+ " ");
        }

	}

}
