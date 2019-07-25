package day9;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArithmeticTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	Arithmetic am = new Arithmetic();
	
	@Test
	public void testAddPositive(){
		assertEquals(15,am.add(8,7));
	}
	@Test
	public void testAddNegative(){
		assertNotEquals(22,am.add(3,4));
	}
	@Before
	public void testBefore(){
		System.out.println("this is BEFORE TEST");
	}
	@After
	public void testAfter(){
		System.out.println("this is AFTER TEST");
	}
	
	@AfterClass
	public static void testAfterClass(){
		System.out.println("AFTER CLASS USE");
	}
	
	@BeforeClass
	public static void testBeforeClass(){
		System.out.println("BEFORE CLASS USE");
	}
	
	
	
	

}
