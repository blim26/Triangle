package package1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {

	public static Triangle obj;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		obj = new Triangle(4,4,4,);
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test 
	public void test() {
		assertEquals(12,obj.getPerimeter(),0);
		assertEquals(6.93,obj.getArea(),.1);
	}
}



