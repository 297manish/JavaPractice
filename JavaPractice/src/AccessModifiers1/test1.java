package AccessModifiers1;

public class test1 {

	public void publicMethod(){
		System.out.println("I am Public");
	}

	private void privateMethod(){
		System.out.println("I am Private");
	}
	
	protected void protectedMethod(){
		System.out.println("I am Protected");
	}
	
	void noAccessModifierMethod(){
		System.out.println("I am no access modifier");
	}
	
	public static void main(String args[]){
		test1 x = new test1();
		
	}
}
