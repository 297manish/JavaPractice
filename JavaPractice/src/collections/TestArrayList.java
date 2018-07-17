package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String args[]){
		
		ArrayList<String> al = new ArrayList<String>();
		System.out.println(al.size());
		al.add("harry");
		al.add("sam");
		al.add("marry");
		al.add("bruno");
		al.remove("sam");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}
}
