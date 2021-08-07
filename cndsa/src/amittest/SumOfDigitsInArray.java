package amittest;

public class SumOfDigitsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {1,20,147,648,7,34};
		 int arr[]=sumOfArray(a);
          for(int i:arr) {
        	  System.out.print(i+ " ");
          }
	}


//op=1,2,12,18,7,7

    public static int[] sumOfArray(int arr[]) {
	   for(int i=0;i<arr.length;i++) {
		   int sum=0;
		       while(arr[i]>0) {
		           int n=arr[i]%10;
		           	sum=sum+n;
		           	arr[i]=arr[i]/10;
		           	
		       }
		       arr[i]=sum;
	       
	
		   
		   
	   }
	   return arr;

	}

}
