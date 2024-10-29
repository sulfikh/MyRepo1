package collectionprograms;

import java.util.ArrayList;
import java.util.List;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> d=new ArrayList<String>();
		d.add("Yelow");
		d.add("Red");
		d.add("Green");
		d.add("Blue");
		d.add("Violet");
		d.add("Black");
		d.add("Black");
		d.add("White");
	    d.set(3, "Cyan");
		System.out.println(d);
		d.set(4, "Indigo");
		System.out.println(d);
		System.out.println(d.indexOf("Black"));
		System.out.println(d.lastIndexOf("Black"));
		d.remove(6);//d.remove("Black");
		System.out.println(d);
		System.out.println(d.get(3));
		System.out.println(d.contains("Indigo"));
		
	}

}
