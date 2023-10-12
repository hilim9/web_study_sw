package exam02;

import org.junit.jupiter.api.*;

public class TDDTest {

    @BeforeAll // 모든 단위 테스트 실행 전 한번만 실행
    static void beforeAll() {
        System.out.println("BeforeAll");
    }

    @AfterAll // 모든 단위 테스트 실행 후 한번만 실행
    static void afterAll() {
        System.out.println("AfterAll");
    }

    @BeforeEach // 각 단위 테스트 메서드 실행 전 실행
    void beforeEach() {
        System.out.println("BeforeEach");
    }

    @AfterEach // 각 단위 테스트 메서드 실행 후 실행
    void afterEach() {
        System.out.println("AfterEach");
    }

    @Test
    void test1() {
        System.out.println("test1");
    }
    @Test
    void test2() {
        System.out.println("test2");
    }

}
