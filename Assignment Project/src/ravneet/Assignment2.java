package ravneet;

public class Assignment2 {

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
			
			Assignment2 assignment = new Assignment2();
			int result1 = assignment.div(10,2);
			int result2 = assignment.subtract(result1, 2);
			int result3 = assignment.sum(result2, 2);
			int result4 = assignment.subtract(result3, 2);
			int result5 = assignment.multiply(result4, 2);
			
			System.out.println("Actual Answer of (((((10/2)-2)+2)-2)*2) is : "+result5);

		}

	}



