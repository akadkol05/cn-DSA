package arrays;



public class Rotate {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int d=5;
		
		arr=rotate(arr,d);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] rotate(int arr[],int d) {
		int a[]=new int[d];
		for(int i=0;i<a.length;i++) {
			a[i]=arr[i];
		}
		for(int i=0;i<arr.length-d;i++) {
			arr[i]=arr[i+d];
		}
		for(int i=0;i<a.length;i++) {
			arr[arr.length-d+i]=a[i];
		}
		return arr;
	}

}
