import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {

	@Test
	public void testNfactorial0() {
		MyCalculator mc = new MyCalculator();
		int actual = mc.nfactorial(0);
		assertEquals("0! = 1",actual,1,0.0);
		//fail("Not yet implemented");
	}
	
	public void testNfactorial1() {
		MyCalculator mc = new MyCalculator();
		int actual = mc.nfactorial(1);
		assertEquals("1! = 1",actual,1,0.0);
		//fail("Not yet implemented");
	}
	
	public void testNfactorial2() {
		MyCalculator mc = new MyCalculator();
		int actual = mc.nfactorial(5);
		assertEquals("5! = 1",actual,120,0.0);
		//fail("Not yet implemented");
	}

	@Test
	public void testBinarySearch0() {
		MyCalculator mc = new MyCalculator();
		int[] array = {0,1,2,3,4,5,6};
		int actual = mc.binarySearch(array, 3);
		assertEquals("Index of 3 is 3",actual,3,0.0);
		//fail("Not yet implemented");
	}
	
	public void testBinarySearch1() {
		MyCalculator mc = new MyCalculator();
		int[] array = {0,1,2,3,4,5,6};
		int actual = mc.binarySearch(array, 5);
		assertEquals("Index of 5 is 5",actual,5,0.0);
		//fail("Not yet implemented");
	}
	
	public void testBinarySearch2() {
		MyCalculator mc = new MyCalculator();
		int[] array = {0,1,2,3,4,5,6};
		int actual = mc.binarySearch(array, 1);
		assertEquals("Index of 1 is 1",actual,1,0.0);
		//fail("Not yet implemented");
	}
	
	public void testBinarySearch3() {
		MyCalculator mc = new MyCalculator();
		int[] array = {0,1,2,3,4,5,6};
		int actual = mc.binarySearch(array, 4);
		assertEquals("Index of 4 is 4",actual,4,0.0);
		//fail("Not yet implemented");
	}
	
	public void testBinarySearch4() {
		MyCalculator mc = new MyCalculator();
		int[] array = {0,1,2,3,4,5,6};
		int actual = mc.binarySearch(array, 2);
		assertEquals("Index of 2 is 2",actual,2,0.0);
		//fail("Not yet implemented");
	}
	
	public void testBinarySearch5() {
		MyCalculator mc = new MyCalculator();
		int[] array = {0,1,2,3,4,5,6};
		int actual = mc.binarySearch(array, 0);
		assertEquals("Index of 0 is 0",actual,0,0.0);
		//fail("Not yet implemented");
	}
	
	public void testBinarySearch6() {
		MyCalculator mc = new MyCalculator();
		int[] array = {0,1,2,3,4,5,6};
		int actual = mc.binarySearch(array, 6);
		assertEquals("Index of 6 is 6",actual,6,0.0);
		//fail("Not yet implemented");
	}

}
