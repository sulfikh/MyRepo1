package assignment_programs;

public class VotingEligibility {

		public static boolean voting(int age) {
			
			if(age>=18) {
				System.out.println("You are eligible for voting!!!");
			}			
			
			else
				System.out.println("Your are under 18, so not eligible for Voting!");
			return false;
			
			
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				VotingEligibility.voting(17);
	}

}
