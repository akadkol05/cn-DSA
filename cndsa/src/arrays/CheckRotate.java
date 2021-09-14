package arrays;

public class CheckRotate {



	public static void main(String[] args) {
         int a[]= {4,5,1,2,3};
        
		int k=a[0];
		int min=0;
		
         for(int i=0;i<a.length;i++) {
         
        	 if(a[i]<k) {
        		min=i;
        		k=a[i];
        	 }
         }	
         System.out.println(min);
      

	}

}
