/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.minhthien.mathutil.main;

import com.minhthien.mathutil.core.MathUtility;

/**
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
        testFactorialGivenRightArgument0ReturnWell();

        testFactorialGivenRightArgument5ReturnWell();
    }


    // test case #2
    // description: to check, to verify the getFactorial() method with correct
    //                                                     given argument, e. g n = 5
    //              vietsub: kiểm tra hàm giai thừa có đúng với n = 5 hay k?

    // steps/procedures:
    // CALL getFactorial() method with valig arg: getFactorial(5)

    // expected result (ta hy vọng hàm trả về gì với n = 5)
    //          to have number 120 as the result of 5!
    //          vietsub: hy vọng hàm trả về 120 với 5!

    // status (trạng thái của test case là gì sau khi chạy app, chạy hàm)
    //      passed, failed (bug)
    //      chờ xem hàm, app xử lý dc số mấy - actual value
    //      và đi so sánh với expected ở trên để luận đúng/sai !!!

    // mlem vì 5! trả về 120 thật mà!

    // viết code test để test hàm chính getFactorial() chạy đúng với n = 5 hay k?

    static void testFactorialGivenRightArgument5ReturnWell() {
        System.out.println("5! = \n"
                + "expected value: 120\n"
                + "actual value: " + MathUtility.getFactorial(5));
    }


    // ta sẽ test hàm của ta viết ra, gọi là unit testing - test những đơn vị
    // code cơ bản nhất
    // ta cần test hàm getFactorial() với các bộ data đưa vào -> những test case
    // test case là gì? : những bộ data đưa vào hàm, app, và cách thức xài bộ data này
    //                    và kèm theo kết quả kì vọng app/hàm sẽ trả về



    // test case #1 (test case id)
    // description: (mô tả mục đích test case, test case dùng test điều gì?)
    //              to check, to verify the getFactorial() method with correct
    //                                                     given argument, e. g n = 0
    //              vietsub: kiểm tra hàm giai thừa có đúng với n = 0 hay k?
    // steps/procedures: (các bước test hàm/app, nhấn gì, nhập gì...)
    // CALL getFactorial() method with valig arg: getFactorial(0)

    // expected result (ta hy vọng hàm trả về gì với n = 0)
    //          to have number 1 as the result of 0!
    //          vietsub: hy vọng hàm trả về 1 với 0!

    // status (trạng thái của test case là gì sau khi chạy app, chạy hàm)
    //      passed, failed (bug)
    //      chờ xem hàm, app xử lý dc số mấy - actual value
    //      và đi so sánh với expected ở trên để luận đúng/sai !!!

    // mlem vì 0! trả về 1 thật mà!

    // viết code test để test hàm chính getFactorial() chạy đúng với n = 0 hay k?

    static void testFactorialGivenRightArgument0ReturnWell() {
        int n = 0; // dự tính tính 0!
        long expectedResult = 1; // 0! hy vọng là 1
        long actualResult = MathUtility.getFactorial(0); // tính thử 0! bằng hàm

        // so sánh
        System.out.println(n + "! = \n"
                + "expected value: " + expectedResult + "\n"
                + "actual value: " + actualResult);
    }


}
