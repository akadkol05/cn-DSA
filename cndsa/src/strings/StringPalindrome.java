package strings;

public class StringPalindrome {
	public static boolean isPalindrome (String s) {
        String str="";
		int n=s.length();
	    for(int i=n-1;i>=0;i--) {
	    	str=str+s.charAt(i);
	    }
	    
	    if(s.equals(str)) {
    		return true;
    	}
	    
	    return false;	
	}

	public static void main(String[] args) {
		String s="abcd";
	 System.out.println(isPalindrome(s));
	     
	}

}
