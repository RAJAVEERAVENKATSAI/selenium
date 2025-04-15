package selenium;

public class Operations_debugging {

	

	    public static void main(String[] args) {
	        int a = 5;
	        int b = 10;
	        int sum = 0;

	        // Debugging output to check values
	        System.out.println("Initial values: a = " + a + ", b = " + b);

	        // Perform calculation
	        sum = addNumbers(a, b);

	        // Debugging output to check result of the addition
	        System.out.println("Result after addition: sum = " + sum);
	    }

	    public static int addNumbers(int num1, int num2) {
	        // Debugging output to check method inputs
	        System.out.println("Inside addNumbers method: num1 = " + num1 + ", num2 = " + num2);

	        // Add the numbers
	        int result = num1 + num2;

	        // Debugging output to check the result before returning
	        System.out.println("Addition result: " + result);

	        return result;
	    }
	}
