package exceptionhandling;

public class Customexpt {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		int age=16;
		if(age>=18) {
			System.out.println("You are eligible for voting!!!");
		}
		
		else {
			//System.out.println("You are not eigible for voting!!!");
			throw new MyException ("Age under 18");
		}
	}

}
