package assignment_programs;

public class ReverseConstructorsprgm {
	
	int num,m,r,rev=0;
	public ReverseConstructorsprgm() {
		this(123456789);
		System.out.println("Value Riversed    :"+ rev);
	}
	public ReverseConstructorsprgm(int num) {
		
		while(num!=0){			
			m=num%10; 
			r=rev*10;
			rev=r+m;
			num=num/10;
			}			
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseConstructorsprgm obj=new ReverseConstructorsprgm();
		
	}

}
