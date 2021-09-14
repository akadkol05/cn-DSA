package arrays;

import java.util.Scanner;

public class Arrays_sum {

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
				sum (arr);
		}
		
		
			
			
		}

	
	public static void sum(int arr[]) {
		int n=arr.length;
		int sum1=0;
		for(int i=0;i<n;i++){
			sum1=sum1+arr[i];
		}
		System.out.println(sum1);
		
		
	}

}
