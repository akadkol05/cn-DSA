package amittest;

import java.util.Arrays;
import java.util.Scanner;

public class AP {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("n= ");
		int n=s.nextInt();
		
		System.out.println("enter series= ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(arithmathic(arr,n));
	}
		
		
   public static boolean arithmathic(int arr[],int n) {
	   Arrays.sort(arr);
	   int  d=arr[1]-arr[0];
		for(int i=2;i<n;i++) {
			
			if((arr[i]-arr[i-1])!=d) {
			 return false;
			}
			
		}
		return true;
		


	}

}
