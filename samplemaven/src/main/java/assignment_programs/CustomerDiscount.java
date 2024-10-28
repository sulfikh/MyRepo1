package assignment_programs;

public class CustomerDiscount {
	static int total=0;
	public static int calc(int itm1, int itm2, int itm3) {
		 total=itm1+itm2+itm3;
		System.out.println(total);
		return total;		
	}
	public static void discheck() {
		if(total>=5000) {
			total=total/100*20;
			System.out.println("You are eligible for 20% discount!!! \nYour total Rs. : "+total);
		}
		else {
			
			System.out.println("Your total price is :"+total);
			
		}
	} 
	public static void main(String[] args) {
		CustomerDiscount.calc(678,4678,89);
		CustomerDiscount.discheck();
	}
	

}
