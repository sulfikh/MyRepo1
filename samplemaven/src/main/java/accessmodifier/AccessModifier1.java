package accessmodifier;

public class AccessModifier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier1 obj=new AccessModifier1();
		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();
	}
	public void display1() {
		System.out.println("This is public access specifier");
	}
	private void display2() {
		System.out.println("This is private access specifier");
	}
	protected void display3() {
		System.out.println("This is protected access specifier");
	}
	void display4() {
		System.out.println("This default access specifier");
	}
	
}
