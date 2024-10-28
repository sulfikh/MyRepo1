package assignment_programs;

public class Thisfactorialmethods {
	int num,fact=1;
	public int facto1(int num) {
		System.out.println("Given Number is :"+num);	
		System.out.print("Factorial epansion: ");
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			System.out.print(fact+"  ");
			
		}
		this.factoprint();
		return fact;
		
	}
	
	public void factoprint() {
		System.out.println("\n\nThe factorial value of "+num+" is :"+fact);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thisfactorialmethods obj=new Thisfactorialmethods();
		obj.facto1(7);		
	}

}
