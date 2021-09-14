package arrays;

public class Intersection {

	public static void main(String[] args) {
		  int arr1[]= { 2 ,6,1,2};
		  int arr2[]= { 1, 2, 3, 4, 2};
		  findIntersection(arr1,arr2);
		  

		   

	}
	public static void findIntersection(int arr1[],int arr2[]) {
		 int n=arr1.length;
		  int m=arr2.length;
		
		  for(int i=0;i<n;i++) {
			  for (int j=0;j<m;j++) {
			     if(arr1[i]==arr2[j]) {
				  System.out.print(arr1[i]+" ");
				  arr2[j]=Integer.MAX_VALUE;
				  break;
			     }
			 }
		  }
	
	
		  

 }
}
	
