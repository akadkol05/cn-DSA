package loop;

public class ContinueInLoop {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			if(i==5) {
				i++;
				continue;
			}
			System.out.println(i);
			i=i+1;
		}
	
		

	}

}
