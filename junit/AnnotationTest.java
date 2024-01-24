package junit;

//created by Dipali jambhale
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationTest {

	@Test
	public void test()
	{
		System.out.println("test case :");
	}
	@After
	public void after()
	{
		System.out.println("after annotation test :");
	}
	@Before
	public void before() {
		System.out.println("before annotation test :");
	}
	@Ignore
	public void ignore()
	{
		System.out.println("Ignore case Annotation :");
		
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After the class :");
	}
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before the class ");
	}	
}
