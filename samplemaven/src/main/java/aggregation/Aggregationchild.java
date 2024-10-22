package aggregation;

public class Aggregationchild {
	int roll;
	String city;
	Aggregationprgrms ref;//aggregation variable
	public Aggregationchild(int roll, String city,Aggregationprgrms ref) {
		this.roll=roll;
		this.city=city;
		this.ref=ref;
	}
	public void display() {
		System.out.println(ref.name+ref.age);
		System.out.println(roll+city);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregationprgrms obj=new Aggregationprgrms("Sulfi",35);
		Aggregationchild obj1=new Aggregationchild(101,"Palakkad",obj);
		obj1.display();
		
	}

}
