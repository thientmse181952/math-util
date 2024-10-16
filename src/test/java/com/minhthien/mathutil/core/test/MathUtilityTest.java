package com.minhthien.mathutil.core.test;

import com.minhthien.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    // test case #5:
    @Test
    public void testFactorialGivenWrongArgumentsThrowsException() {
        // MathUtility.getFactorial(-5); chưa bắt xem có ngoại lệ như kì vọng hay k

        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(-1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(-2);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(-100);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(21);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(22);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(50);
        });assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(100);
        });
    }

    // test case structure: ID, description, steps/procedures
    //                      expected result, status (passed, failed)
    //                      bug ID (bugzilla, jira)

    // test case #4: check getFactorial() with n = -1 -2 -3 -4 -5 21 22 23 24
    @Test
    public void testFactorialGivenWrongArgumentMinus5ThrowsException() {
        // MathUtility.getFactorial(-5); chưa bắt xem có ngoại lệ như kì vọng hay k

        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(-5);
        });
    } // thấy ngoại lệ mừng rơi nước mắt
    // vì hàm thiết kế rằng đưa n < 0 hoặc n > 20 thì ngoại lệ phải dc ném ra
    // vậy nếu hàm ném ngoại lệ khi n = -5 thì rõ ràng hàm đúng, hàm đúng thì phải xanh
    // xanh vì trả về ngoại lệ đúng như kì vọng


    // test case #3 (gộp): check getFactorial() with n = 2 3 4 5 6 ...
    @Test
    public void testFactorialGivenRightArgumentsReturnsWell() {
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(720, MathUtility.getFactorial(6));
    } // bad smells = đoạn code bốc mùi (Robert C. Martin - Clean Code)
    // code bị lặp lại, trộn lộn xộn test data và lệnh kiểm thử
    // ta cần tinh chỉnh, tối ưu code - REFACTOR, REFACTORING

    // test case #2: check getFactorial() with n = 1
    @Test
    public void testFactorialGivenRightArgument1ReturnsWell() {
        assertEquals(1, MathUtility.getFactorial(1));
    }

    // test case #1: check getFactorial() with n = 0
    // ...
    @Test
    public void testFactorialGivenRightArgument0ReturnsWell() {
        long expectedValue = 1; // hy vọng 0! trả về 1
        long actualValue = MathUtility.getFactorial(0);

        // so sánh 2 thằng expected vs actual
        assertEquals(expectedValue, actualValue);
    }
}