package testInterface;

public class test implements InterfaceA, InterfaceB{


	public void a() {
		// TODO Auto-generated method stub
		System.out.println("Interface A - Method A");
	}


	public static void main(String args[]){

		
		InterfaceB y = new test() ;
		y.b();
		y.a();

	}


	
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("Interface B - Method B");
	}
}
