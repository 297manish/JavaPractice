package testArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Aaa");
		al.add("Bbb");
		al.add("Ccc");
		al.add("Ddd");
		al.add("123");		
		System.out.println(al);
		System.out.println(al.size());
		
		Iterator itr = al.iterator();
		/*while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		
		for(String a : al){
			System.out.println(a);
		}

	}

}
