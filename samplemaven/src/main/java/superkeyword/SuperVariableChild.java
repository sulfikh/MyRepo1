package superkeyword;

public class SuperVariableChild extends SuperVariableex1{

	String color="Violet";
	public void display() {
		System.out.println(color);
		System.out.println(super.color); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperVariableChild obj=new SuperVariableChild();
		obj.display();
	}

}
