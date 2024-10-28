package assignment_programs;

public class InheritanceAssclass2 extends InheritanceAssclass1 {
	float hra=0,pf=0;
	public void hra() {
		hra=bpay*5/100;
		//System.out.println("HRA :"+hra);		
	}
	public void pf() {
		pf=bpay*20/100;
		//System.out.println("PF :"+pf);
	}

}
