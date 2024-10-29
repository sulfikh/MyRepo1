package collectionprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExs {
	
public static void main(String args[]) {
	
	ArrayList<String> f=new ArrayList<String>();
	f.add("Yelow");
	f.add("Red");
	f.add("Green");
	f.add("Blue");
	f.add("White");
    System.out.println(f);
    Iterator ref=f.iterator();
    while(ref.hasNext())
    {
    	System.out.println(ref.next());
    }
    ref.remove();
    System.out.println(f);
}	

}
