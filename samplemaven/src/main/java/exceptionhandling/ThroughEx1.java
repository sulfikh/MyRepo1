package exceptionhandling;

public class ThroughEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=18;
		if(age>=18) {
			System.out.println("You are eligible for voting!!!");
		}
		
		else {
			//System.out.println("You are not eigible for voting!!!");
			throw new ArithmeticException ("Age under 18");
		}
		
	}
	

}
