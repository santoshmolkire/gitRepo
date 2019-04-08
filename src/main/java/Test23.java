import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerTest.class)
public class Test23 {
	 @Test

	   public void testRealReportOne(){

	        Assert.assertTrue(true);

	    }

	    

	    @Test

	    public void testRealReportTwo(){

	        Assert.assertTrue(false);

	    }

	    //Test case depends on failed testcase= testRealReportTwo

	    @Test(dependsOnMethods="testRealReportTwo")

	    public void testRealReportThree(){

	        

	    }
}
