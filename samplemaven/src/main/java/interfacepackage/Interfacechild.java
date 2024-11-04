package interfacepackage;

public class Interfacechild implements InterfaceProgrm{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfacechild obj=new Interfacechild();
		obj.display();
		obj.dis();
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Interface program");
	}

	@Override
	public void dis() {
		// TODO Auto-generated method stub
		System.out.println("Interface programsssss");
	}

}
