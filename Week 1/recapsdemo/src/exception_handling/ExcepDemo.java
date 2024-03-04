package exception_handling;


public class ExcepDemo {
	public static void main(String[] args) {
		System.out.println("Open File");
		System.out.println("Read Data from file");
		try {
		System.out.println(div(10,0));
		}
		catch(ArithmeticException e) {
			System.err.println("Cannot divide by zero bro");
		}
		System.out.println("Close File");
	}
	
	public static int div(int a, int b) throws ArithmeticException{
		
		return a/b;
	}
	
}

