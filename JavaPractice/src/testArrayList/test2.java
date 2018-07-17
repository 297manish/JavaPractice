package testArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class test2 {

	int rollNo ;
	String name;
	
	public test2(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public static void main(String[] args) {
		
	test2 t1 = new test2(1, "manish");
	test2 t2 = new test2(2, "ashish");
	
	ArrayList<test2> al = new ArrayList<test2>();
	al.add(t1);
	al.add(t2);
	
	System.out.println(al);
	System.out.println(al.size());
	
	Iterator<test2> itr = al.iterator();
	while(itr.hasNext()){
		test2  x = itr.next();
		System.out.println(x.name +" "+ x.rollNo);
	}
	}

}
