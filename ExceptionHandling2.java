package Week2;
import java.util.*;


public class ExceptionHandling2 {

	int n1, n2,result;
	Scanner sc= new Scanner(System.in);
	void calculate() {
		try {
		System.out.println("Enter first number");
		n1= sc. nextInt();
		System.out.println("Enter 2nd number");
		n2= sc. nextInt();
		
		result=n1/n2;
		}
		catch(InputMismatchException ime) {
			System.out.println("IME Detected");
		}
		catch(ArithmeticException ae) {
			System.out.println("AE Detected");
		}
		catch(Exception e) {
			System.out.println("Exception Found"+e.getMessage());
			
		}
		finally {
			System.out.println("The Division is "+result);
		}
		
		
	}
	
	public static void main(String[] args) {
		ExceptionHandling2 obj= new ExceptionHandling2();
		obj.calculate();
//		
		
	}

}
