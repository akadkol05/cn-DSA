package functions;

public class Increment {
	public static void increment(int n) {
		n=n+1;
	}

	public static void main(String[] args) {
		int a=10;
		increment(a);
		System.out.println(a);

	}

}
//it will pass 10 to increment but it wont print 11 it will print 10 since it will not update a it vil change in increment function only
	