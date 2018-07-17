package testReturnType;

public class test1 {

	public int add(int i, int j){
		int result = i+j;
		System.out.println(result);
		return result;
	}
	
	public boolean compare(String a, String b){
		
		if(a.equals(b)){
			return true;
		}else{
			return false;
		}
	}
}
