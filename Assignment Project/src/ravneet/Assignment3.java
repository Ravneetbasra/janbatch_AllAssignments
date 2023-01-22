package ravneet;

import java.util.Scanner;

//(((x1+x2)+x3)-x4)/x5)*x6)

public class Assignment3 {
	

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
	int sumresult1 = class1.sum(x1, x2);
	int sumresult2 = class1.sum(sumresult1, x3);
	int subresult = class1.sub(sumresult2,x4);
	int divresult = class1.division(subresult, x5);
	int multiplyresult = class1.multiply(divresult, x6);
	
	System.out.println("Overall Result : "+multiplyresult);
	}

}
