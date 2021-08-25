package arrays;

import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {

		  int arr[]= {0 ,7, 2, 5, 4, 7, 1, 3, 6};
		  int duplicate=findDuplicate(arr);
		  System.out.println(duplicate);

		   

	}
	public static int findDuplicate(int arr[]) {
		   Arrays.sort(arr);
		  
	        for(int i=0;i<arr.length-1;i++){
	            if(arr[i]==arr[i+1]){
	                return arr[i];
	            }
	        }
	        return -1;
	       
	        
	

	}

}
