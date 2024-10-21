package samplemavenpackage;

public class StringBufferEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello");
		sb.append("Java");
		System.out.println(sb);
		sb.insert(3, "insert");
		System.out.println(sb);
		sb.replace(3, 6, "Testing");
		System.out.println(sb);
		sb.delete(3, 4);
		System.out.println(sb);
		sb.reverse();
		/*System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("Sulfiker");
		System.out.println(sb.capacity());
		sb.append("This is my string buffer program");
		System.out.println(sb.capacity());
		sb.ensureCapacity(10);
		System.out.println(sb.capacity());
		sb.ensureCapacity(50);Xj
		System.out.println(sb.capacity());*/
		
	}

}
