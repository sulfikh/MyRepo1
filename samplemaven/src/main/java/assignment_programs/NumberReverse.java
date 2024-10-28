package assignment_programs;
//import java.util.*;
public class NumberReverse {
	int num,rev;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :");
		int num=sc.nextInt();*/
		
		NumberReverse obj=new NumberReverse();
	}
	public  NumberReverse(int num) {
		
		this.num=num;
		int r,m;
		rev=0;
		while(num!=0){	
		m=num%10;
		r=rev*10;
		rev=r+m;
		num=num/10;
		
		}
	}
	public NumberReverse() {
		this(12345678);
		System.out.println("Value Riversed :"+ rev);
	}

}
