package collections;

import java.util.ArrayList;

public class example1 {

	public static void main(String[] args) {
		
		example e1 = new example(1, "manish");
		example e2 = new example(2, "sourav");
		example e3 = new example(3, "anil");
		
		ArrayList<example> al = new ArrayList<example>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		for(example x : al){
			System.out.println(x.rollNo +"  "+ x.name);
		}

	}

}
