package exceptionhandling;

public class CustomExceptionHandlingClass {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
		int age=17;
		if(age>=18) {
			System.out.println("You are eligible for voting!!!");
		}
		
		else {
			//System.out.println("You are not eigible for voting!!!");
			throw new VotingException("Age under 18");
		}
	}

}
