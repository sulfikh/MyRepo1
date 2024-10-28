package assignment_programs;

public class InheritanceAssclass3 extends InheritanceAssclass2{
	float b,c,totsal=0,grosssal=0;
	public void salaryslip() {
		System.out.println("Basic Pay : "+bpay);
		System.out.println("Deduction : "+ded);
		System.out.println("HRA       : "+hra);
		System.out.println("PF        : "+pf);
		System.out.println("Bonus     : "+bon);		
	}
	public void totalsalary() {
		totsal=bpay+hra-pf-ded+bon;
		grosssal=bpay+hra+pf+ded+bon;
		System.out.println("========================");
		System.out.println("Total Sal : "+totsal);
		System.out.println("Your Gross Salary is : "+grosssal);
	}
	public static void main(String arrgs[]) {
		InheritanceAssclass3 obj=new InheritanceAssclass3();
		obj.salary();
		obj.hra();
		obj.pf();
		obj.salaryslip();
		obj.totalsalary();
	}
	
}
