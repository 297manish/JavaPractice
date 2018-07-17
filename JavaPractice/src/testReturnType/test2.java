package testReturnType;

public class test2 {

	public static void main(String args[]){
		test1 t = new test1();
		
		//boolean res = t.compare("hello", "hello1");
		if(t.compare("asd", "asd")){
			System.out.println("Test CAse Pass");
		}else{
			System.out.println("Test Case Fail");
		}
	}
}
