package ravneet;

public class Calculator {

	public int sum(int a, int b) {
		
		int c = a+b;
		
		return c;
		
	}
	
	public int subtract(int a, int b) {
		
		int c = a-b;
		
		return c;
		
	}
	
	public int multiply(int a, int b) {
		
		int c = a * b;
		return c;
		
	}
	
	public int div(int a, int b) {
		
		int c = a/b;
		return c;
		
	}
	public static void main(String[] args) {
		// (((((10+2)+2)-2)*2)/2)
		
		Calculator calculator = new Calculator();
		int result1 = calculator.sum(10,2);
		int result2 = calculator.sum(result1, 2);
		int result3 = calculator.subtract(result2, 2);
		int result4 = calculator.multiply(result3, 2);
		int result5 = calculator.div(result4, 2);
		
		System.out.println("Actual Answer of (((((10+2)+2)-2)*2)/2) is : "+result5);

	}

}
