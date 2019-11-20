package TestDemo_Assertion;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestDemo_Assert {

@Test
	public void test()
	{
		System.out.println("This is a test for assertion");
	}

@Test
	public void test1()
	{
		System.out.println(" Assertion for true conditions");
		Assert.assertTrue(30>20);
	}

@Test
	public void test2()
	{
		System.out.println(" Assertion for equals conditions");
		int a=20;
		int b=120;
		Assert.assertEquals(a,b);
	}

}
