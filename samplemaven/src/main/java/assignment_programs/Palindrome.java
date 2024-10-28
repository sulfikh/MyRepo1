package assignment_programs;
public class Palindrome {
	static int temp,n,r,sum=0;
	
	public static void reverse(int n) {
		
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;
		  }
	}
	public static void display() {

if(temp==sum)
	System.out.println("Entered Number is a Pallindrome");
else
	System.out.println("Entered Number is not a Palindrome");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome.reverse(154451);
		Palindrome.display();
	}

}


