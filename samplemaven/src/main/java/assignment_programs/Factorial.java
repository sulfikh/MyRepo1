package assignment_programs;

public class Factorial {

		public static int facto(int n) {
			
			if(n==0)
				return 1;
			else
				return(n*facto(n-1));
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		int num=6;
		fact=facto(num);
		System.out.println("Factorial of "+num+" is "+fact);
	}

}
