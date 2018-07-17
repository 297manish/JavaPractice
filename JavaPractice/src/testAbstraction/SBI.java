package testAbstraction;

public abstract class SBI extends RBI {

	@Override
	public void roi() {
		System.out.println("rate of intrest of sbi is 8%");
		
	}
	
	public void sbiManager(){
		System.out.println("sbi manager");
	}

	public abstract void sbiAddress();
}
