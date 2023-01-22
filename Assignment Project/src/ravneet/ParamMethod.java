package ravneet;

public class ParamMethod {

	public void method1() {
		this.fourParam(5,6,7,8);
		this.defaultMethod();
		this.oneParamMethod(5);
		this.threeParamMethod(6,70, 8);
		this.twoParamMethod(3, 4);
		
	}
	
	
	public void fourParam(int x, int y, int z, int w) {
		
		System.out.println("Four Parameterized method");
	}
	
	public void defaultMethod() {
		System.out.println("Default Method");
	}
	
	public void oneParamMethod(int x) {
		
		System.out.println("One Parameterized method");
	}
	
	public void twoParamMethod(int x, int y) {
		
		System.out.println("Two Parameterized method");
	}
	
	public void threeParamMethod(int x, int y, int z) {
		
		System.out.println("Three Parameterized method");
	}
	
	
	public static void main(String[] args) {

		ParamMethod parammethod = new ParamMethod();
		parammethod.method1();
		
		
	}

}
