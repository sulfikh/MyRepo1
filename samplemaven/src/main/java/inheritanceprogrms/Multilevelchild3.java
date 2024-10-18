package inheritanceprogrms;

public class Multilevelchild3 extends Multilevelchild2{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevelchild3 obj=new Multilevelchild3();
		obj.display1();
		obj.display2();
		obj.display3();
	}
	public void display3() {
		System.out.println("This is child class: C");
	}
}
