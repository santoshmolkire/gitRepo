import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {

	public void onTestStart(ITestResult result) {
	System.out.println("on test start"+result.getName());
		
	}

	public void onTestSuccess(ITestResult resultsucc) {
		System.out.println("on test success"+resultsucc.getName());
		
	}

	public void onTestFailure(ITestResult resultfail) {
		System.out.println("on test success"+resultfail.getName());
		
	}

	public void onTestSkipped(ITestResult resultskip) {
		System.out.println("on test success"+resultskip.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult resultperscucess) {
		System.out.println("on test success"+resultperscucess.getName());
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
