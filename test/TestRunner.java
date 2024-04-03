package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestBanking.class);
        
        if (result.wasSuccessful()) {
            System.out.println("Tất cả các testcase đã chạy thành công!");
        } else {
            System.out.println("Có lỗi xảy ra trong quá trình kiểm thử:");
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
        }
    }
}
