package exam02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class TDDTest2 {
    @TempDir
    File file;
    
    @Test
    void test1() {
        System.out.println(file.getAbsolutePath()); // 임시파일 생성
    }

    @Test
    void test2(@TempDir File file2) {
        System.out.println(file2.getAbsolutePath());
    }


    @Test
    @Timeout(2)
    void test3() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
