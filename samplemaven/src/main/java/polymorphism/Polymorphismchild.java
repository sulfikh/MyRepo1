package polymorphism;

public class Polymorphismchild extends Polymorphysm1 {

		public void display(int a, int b) {
			int c=a-b;
			System.out.println(c);
			super.display(45,67);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphismchild obj=new Polymorphismchild();
		obj.display(34, 45);
		
	} 

}
