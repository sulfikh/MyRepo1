package assignment_programs;
public class GradeofStuds {
	float total;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("To find 2 students average mark");
		System.out.println("================================");
		System.out.println("Student 1:");
		GradeofStuds obj1=new GradeofStuds(45.50f,56.3f,67.5f);
		obj1.average();
		System.out.println("\n\nStudent 2:");
		GradeofStuds obj2=new GradeofStuds(67,78,98);
		obj2.average();
	}

	public GradeofStuds(float s1, float s2, float s3) {
		System.out.println("sub 1: "+s1+"\nsub 2: "+s2+"\nsub 3: "+s3);
		total=s1+s2+s3;
		System.out.println("Total marks scored: "+total);
		
		
		}
	public void average() {
		
		float avg=total*100/300;
		System.out.println("Average of marks: "+avg);
		
		if(avg>=90 && avg<100) {
			System.out.println("You are passed grade is A");
		}
		else if(avg>=80 && avg<89) {
			System.out.println("You are passed grade is B");
		}
		else if(avg>=70 && avg<79) {
			System.out.println("You are passed grade is C");
		}
		else
			System.out.println("Your are failed grade is D");
	
		}
	
	}

		

