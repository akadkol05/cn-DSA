package test1;

import java.lang.reflect.Array;

public class ReverseTheArray {
	public static void reverse (int arr[]) {
		int n=arr.length-1;
		for(int i=0;i<n/2;i++) {
		    int temp=arr[i];
		    arr[i]=arr[n-i];
		    arr[n-i]=temp;
		}
		for(int e: arr) {
			System.out.print(e+ " ");
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {1, 2, 3 ,4, 5, 6};
		reverse(arr);
		
	}	

}
