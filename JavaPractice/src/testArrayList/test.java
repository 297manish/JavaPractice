package testArrayList;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		System.out.println(al.size());
		al.add("car");
		al.add("bus");
		al.add("truck");
		al.add("train");
		System.out.println(al.size());
		System.out.println(al);
		/*for(int i=0; i<al.size(); i++){
			System.out.println(al.get(i));
		}*/
		
		for(String x : al){
			System.out.println(x);
		}
		
		al.remove(1);
		System.out.println(al.size());
		System.out.println(al);
	}

}
