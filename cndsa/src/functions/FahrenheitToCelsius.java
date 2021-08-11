package functions;

import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void celsius(int start,int end,int size) {
		 for(int i=start;i<=end;i=i+size) {
	        	int c=(int)((5.0/9)*(i- 32));
	        	
	        	System.out.println(i+"  " +c);
	        	
	        }
		
		
	}

	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
        int start=s.nextInt();
        int end=s.nextInt();
        int size=s.nextInt();
       celsius(start,end,size);

	}

}
