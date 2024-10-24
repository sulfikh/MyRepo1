package abstractionprograms;

public class abstractionchild extends AbstractionEx1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstractionchild obj=new abstractionchild();
		obj.add(3, 6);
		obj.add();
		obj.display();
		obj.dispplay2();
			
		
	}
	public void add() {
		int sum=2+6;
		System.out.println(sum);
	}
	public void dispplay2() {
		System.out.println("Abstract child class");
	}

}
