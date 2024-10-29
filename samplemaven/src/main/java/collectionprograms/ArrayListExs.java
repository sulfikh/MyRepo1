package collectionprograms;

import java.util.ArrayList;

public class ArrayListExs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> f=new ArrayList<String>();
		f.add("Yelow");
		f.add("Red");
		f.add("Green");
		f.add("Blue");
		f.add("White");
	    f.set(3, "Cyan");
	    //System.out.println(f.get(3));
	    System.out.println(f);
	    ArrayList<String> h=new ArrayList<String>();
		h.add("Black");
		h.add("Orange");
		System.out.println(h);
		System.out.println(f.addAll(h));
		System.out.println(f);
		System.out.println(f.contains("Orange"));
		System.out.println(f.get(3));
		System.out.println(f.isEmpty());
		f.remove(2);
		System.out.println(f);
		System.out.println(f.size());
	}

}
