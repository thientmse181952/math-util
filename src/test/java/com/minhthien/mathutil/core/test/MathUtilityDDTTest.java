package com.minhthien.mathutil.core.test;

import com.minhthien.mathutil.core.MathUtility;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    // class này sẽ chứa các hàm kiểm thử code theo style DDT
    // Data Driven Testing, ta tách code kiểm thử (các lệnh assert()) riêng
    // k gộp chung với bộ data kiểm thử
    // mục tiêu: dễ đọc code kiểm thử, dễ đánh giá dc xem có bao nhiêu test case đang dc test
    // đã đủ hay chưa, vì nó rất dễ thấy do data nằm riêng
    // -> giúp nguyên lý pesticide paradox

    // bộ data đưa vào test sẽ để riêng ở 1 hàm public static
    // hàm này trả về 1 mảng các con số < 0 hoặc > 20, đó là những n gây ra
    // exception khi ta xài hàm getF(). Ta test xem hàm có ném ngoại lệ với
    // data cà chớn hay k
    public static Integer[] initWrongDataSet() {
        return new Integer[]{-1, -2, -3, -4, -100, -1000, 21, 22, 23, 100, 1000};
    }

    // test case #...: check if getFactorial() throws IllegalArgumentException
    //                    in case of n < 0 or n > 20
    @ParameterizedTest
    @MethodSource("initWrongDataSet")
    public void testFactorialGivenWrongArgumentsThrowsException(int n) {
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(n);
        });
    }

    // test case #... : check getFactorial() with right arguments and runs ell
    //                                         n = 0 1 2 3 4 ... 18 19 20
    public static Object[][] initRightDataSet() {
        return new Object[][]{{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}};
    }

    @ParameterizedTest
    @MethodSource("initRightDataSet")
    public void testFactorialGivenRightArgumentsRunWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }


}