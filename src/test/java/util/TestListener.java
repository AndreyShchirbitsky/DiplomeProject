package util;

import driver.DriverSingleTon;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.concurrent.TimeUnit;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println(String.format(
                "======================================== STARTING TEST %s ========================================",
                iTestResult.getName()));
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println(String.format(
                "======================================== FINISHED TEST %s Duration: %ss ========================================",
                iTestResult.getName(),
                getExecutionTime(iTestResult)));
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println(String.format(
                "======================================== FAILED TEST %s Duration: %ss ========================================",
                iTestResult.getName(),
                getExecutionTime(iTestResult)));
        takeScreenshot();
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println(String.format(
                "======================================== SKIPPING TEST %s ========================================",
                iTestResult.getName()));
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

    private long getExecutionTime(ITestResult iTestResult) {
        return TimeUnit.MILLISECONDS
                .toSeconds(iTestResult.getEndMillis() - iTestResult.getStartMillis());
    }

    @Attachment(value = "Last screen state", type = "image/png")
    private byte[] takeScreenshot() {
        return ((TakesScreenshot) DriverSingleTon.getDriver())
                .getScreenshotAs(OutputType.BYTES);
    }
}
