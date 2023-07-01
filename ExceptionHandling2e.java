package Week2;

public class ExceptionHandling2e {
	int getNextNo(int n) {
		try {
			if(n==5) return n+1;
			
		}
		finally {
			System.out.println("This is important code");
		}
		return n-1;
		
	}
	public static void main(String[] args) {
		ExceptionHandling2e obj = new ExceptionHandling2e();
		System.out.println(obj.getNextNo(5));
	}
}
