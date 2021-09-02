package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNum {

	public static void main(String[] args) {
	
		  int arr[]= { 2, 3, 1, 6, 3, 6, 2};
		  int unique=findUnique(arr);
		  System.out.println(unique);

		   

	}
	public static int findUnique(int arr[]) {
		   Arrays.sort(arr);
		  for(int i=0;i<arr.length;i++) {
			  if(arr[i]!=arr[i+1]) {
				  return arr[i];
			  }
		  }
		  return -1;
	}
	

}
