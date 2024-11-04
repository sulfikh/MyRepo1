package exceptionhandling;

public class ExcceptionMaking {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		int i=10;
		int j=0;
		try {
			int c=i/j;
		}
		catch(ArithmeticException name) {
			j=5;
			int e=i/j;
			System.out.println(e);
			System.out.println(name);
		}
		/*
		finally {
			System.out.println("Execution of the program is completed");
			
		}*/
	}

}
