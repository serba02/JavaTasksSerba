package listeners;

import org.testng.*;

/**
 * Created by Ievgen on 13.05.2016.
 */
public class MethodListener implements IInvokedMethodListener {
    @Override
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        Reporter.log("</br>" + "Begin executing method: " + returnMethodName(iInvokedMethod.getTestMethod()));
    }

    @Override
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        Reporter.log("</br>" + "Completed executing method: " + returnMethodName(iInvokedMethod.getTestMethod()) + " Elapsed time: " + (iTestResult.getStartMillis() - iTestResult.getEndMillis()));
    }

    private String returnMethodName(ITestNGMethod method) {
        return method.getRealClass().getSimpleName() + "." + method.getMethodName();
    }
}
