package arrays;

import java.util.Scanner;

public class SwapAlternative {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of arrays");
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
			System.out.println("enter size of array");
			int n=s.nextInt();
			
			System.out.println("enter array elements");
			int arr[]=new int[n];
		
				for(int j=0;j<n;j++) {
					arr[j]=s.nextInt();
				}
				swap (arr,n);
		}
		
		
			
			
		}
	
	public static void swap(int arr[],int n) {
		
	       for(int i=0;i<n-1;i=i+2) {
	    	  
	    		   int temp=arr[i];
	    		   arr[i]=arr[i+1];
	    		   arr[i+1]=temp;
	    		   
	    	   
	    	  
	       }
	       for(int i=0;i<n;i++) {
	    	   System.out.print(arr[i]+" ");
	       }
	       System.out.println();
	      

	}

}
