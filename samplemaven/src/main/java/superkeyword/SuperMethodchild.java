package superkeyword;

public class SuperMethodchild extends SuperMethodEx1{

	public void display1() {
		System.out.println("This is child class");
		super.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethodchild obj=new SuperMethodchild();
		obj.display1();
		
	}

}
