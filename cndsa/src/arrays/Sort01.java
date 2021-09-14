package arrays;

public class Sort01 {

	public static void main(String[] args) {
		int array[]= {0,1,1,0,1};
		sort(array);
	   for(int i=0;i<array.length;i++) {
		  System.out.print(array[i]+ " ");
	  }
	
		

	}

	private static int[] sort(int[] arr) {
		int i=0;
		int j=0;
		int k=arr.length-1;
		
		while(i<=k) {
			if(arr[i]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j++;
				}
		
				else {
				i++;
			   }
				
		}
		return arr;
	}



	

}
