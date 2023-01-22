package ravneet;

import java.util.Scanner;
//(((((x1*x2)-x3)+x4)-x5)/x6)
public class Assignment4 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter x1 variable");
	int x1 = scanner.nextInt();
	System.out.println("Enter x2 variable");
	int x2 = scanner.nextInt();
	System.out.println("Enter x3 variable");
	int x3 = scanner.nextInt();
	System.out.println("Enter x4 variable");
	int x4 = scanner.nextInt();
	System.out.println("Enter x5 variable");
	int x5 = scanner.nextInt();
	System.out.println("Enter x6 variable");
	int x6 = scanner.nextInt();
	
	Class1 class1 = new Class1();
	int result1 = class1.multiply(x1, x2);
	int result2 = class1.sub(result1, x3);
	int result3 = class1.sum(result2, x4);
	int result4 = class1.sub(result3, x5);
	int result5 = class1.division(result4, x6);
	
	System.out.println("Overall Result of (((((x1*x2)-x3)+x4)-x5)/x6) : "+result5);
	}


}
