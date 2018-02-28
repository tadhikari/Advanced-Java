
public class fibonacci {
	
	public void fibo(int n) {
		long a = 0;
		long b = 1;
		long c = 1;
		
		for(int i =0;i<100;i++) {
			System.out.print(c+ " ");
			c = a + b; 
			a = b;
			b = c;
		}
		
		
	}
	
	
	
	
	
	
	
}
