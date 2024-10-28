package assignment_programs;

public class AverageofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AverageofNumbers obj=new AverageofNumbers();
		System.out.print("Avg of Int nums    :   ");
		obj.integermethod(34, 45, 67);
		System.out.print("Avg of Float nums  :   ");		
		obj.integermethod(355.56f, 56.78f, 34.67f);
		System.out.println();
		obj.areaoffigures(3.14f, 45f);
		obj.areaoffigures(120,34);
		obj.areaoffigures(45.56f);
		

	}
	public int integermethod(int a, int b, int c) {
		int sum=a+b+c;
		int avg = sum/3;
		System.out.println(avg);
		return(sum);
	}
	
	public float integermethod(float a, float b, float c) {
		float sum=a+b+c;
		float avg = sum/3;
		System.out.println(avg);
		return(sum);
}
	
	public float areaoffigures(float pie, float rad) {
		float area=pie*rad*rad;
		System.out.println("Area of Circle     :   "+area);
		return(area);
		
	}
	public int areaoffigures(int length, int width) {
		int area=length*width;
		System.out.println("Area of Rectangle  :   "+area);
		return(area);		
	}
	public float areaoffigures(float side) {
		float area=side*side;
		System.out.println("Area of Square     :   "+area);
		return(area);		
	}
}