
import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTests {
	UnitTestMethods ms = new UnitTestMethods();
	
	@Test
	public void addTest() {
		
			int x = 70;
			int y = 20;
			int test = ms.addInts(x, y);
			int expected = 90;
			
			x = -50;y=30;
			int test2 = ms.addInts(x, y);
			int expected2 = -20;
			
			x = -60;y=-30;
			int test3 = ms.addInts(x, y);
			int expected3 = -90;
			
			
			assertEquals(expected,test);
			assertEquals(expected2,test2);
			assertEquals(expected3,test3);
	}
	
	@Test
	public void addString() {
		
			
			String name = "Jacob";
			String last = "Belmore";
			int leninitial = name.length()+last.length();
			
			String test = ms.addString(name, last);
			int finalLen = test.length();
			
			assertEquals(leninitial,finalLen);
	
	}
	


	@Test
	public void findLen() {
			
		String s1 = "";
		int expected1 = 0;
		int len1 = ms.strLen(s1);
		
		String s2 = "Jacob";
		int expected2 = 5;
		int len2 = ms.strLen(s2);
		
		assertEquals(expected1,len1);
		assertEquals(expected2,len2);
		
	}

	@Test
	public void divXbyY() {
		
		int a = 3;
		int b = 5;
		int value1 = ms.divXbyY(a, b);
		int expected = 0;
		
		a = 3;
		b = 0;
		Integer value2 = ms.divXbyY(a, b);
		Integer expected2 = null;
		
		assertEquals(expected,value1);
		assertEquals(expected2,value2);
	}
	
	
	@Test
	public void reverseinArray() {
		int[] x = {1,2,3,4,5};
		
		int[] xrev = ms.reverseIntArray(x);
		
		
		
		int sum1,sum2;
		int[] intSums = sum(x,xrev);
		
		sum1 = intSums[0];
		sum2 = intSums[1];

		assertEquals(sum1,sum2);
		
		}
	
	
	@Test
	public void range() {
		
	int[] a = {0,1,2,3,4};
	int[] aTest = ms.range(5);
	
	int[] sums = sum(a,aTest);
	int sum1 = sums[0];
	int sum2 = sums[1];
	
	
	
	int[] b = {0,2,4,6};
	int[] bTest = ms.range(0,7,2);
	int[] sums2 = sum(b,bTest);
	int sum3 = sums2[0];
	int sum4 = sums2[1];
	
	int[] c = {3,4,5,6};
	int[] cTest = ms.range(3,7);
	int[] sums3 = sum(c,cTest);
	int sum5 = sums3[0];
	int sum6 = sums3[1];
	
	
	assertEquals(sum1,sum2);
	assertEquals(sum3,sum4);
	assertEquals(sum5,sum6);
	}
	
	private int[] sum(int[] x,int[] y) {
		
		int sum1,sum2;
		sum1=0;sum2=0;
		for(int i:x) {
			sum1+=i;
			}
		
		for(int i:y) {
			sum2+=i;
			}
		
		
		return new int[] {sum1,sum2};
	}
	
}
