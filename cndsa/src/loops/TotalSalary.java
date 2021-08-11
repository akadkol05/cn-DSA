package loops;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    String str=s.next();
	    char c=str.charAt(0);
	    int allow=1300;
	    if(c=='A') {
	    	allow=1700;
	    }
	    if(c=='B') {
	    	allow=1500;
	    }
	    double hra=0.20*n;
	    double da=0.50*n;
	    double pf=0.11*n;
	    int totalsalary=(int)  (n+hra+da+allow-pf);
	    System.out.println(" totalsalary= " +totalsalary);
	    
	    

	}

}
