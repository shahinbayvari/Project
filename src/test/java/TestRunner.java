import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result test = JUnitCore.runClasses(TestOrder.class);
        for (Failure failure : test.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(test.wasSuccessful());
    }
}
