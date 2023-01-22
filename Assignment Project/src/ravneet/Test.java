
package ravneet;

public class Test {

	Test() {

		this(3, 4, 5);

		System.out.println("Default Constructor");

	}

	Test(int firstnum, int secondnum, int thirdnum) {

		System.out.println("Three Parameterized Constructor");

	}

	Test(int firstnum) {
		this();
		System.out.println("One Parameterized Constructor");
	}

	Test(int firstnum, int secondnum) {
		this(7, 8, 9, 10);
		System.out.println("Two Parameterized Constructor");
	}

	Test(int firstnum, int secondnum, int thirdnum, int fourthnum) {
		this(6);
		System.out.println("Four Paramertized Constructor");
	}

	public static void main(String[] args) {

		Test test = new Test(6, 7);
	}
}
