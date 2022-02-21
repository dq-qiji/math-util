/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.happy.mathutil.main;

import com.happy.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        
        //ta sẽ kiểm thử bằng cách gọi hàm, với data đưa vào, chạy và so sánh
        //(ACTUAL) so với (EXPECTED)
        // để đảm bảo đúng -> chia các trường hợp, tình huống, bộ data
        // đưa cho hàm, hàm chạy, output, kết luận
        //TEST CASE - TÌNH HUỐNG TEST (MỖI DATA CỤ THỂ ĐỂ TEST HÀM CHO 1 MĐ)
        
        //Test case #1: check getF() with valid argument
        //n = 0, expected = 1; actual: đoán xem!!!
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        //compare
        System.out.println("0! -> expected: " + expected
                            + "; actual: " + actual);
        
        //Test case #2: check getF() with valid argument
        //n = 6, expected = 720; actual: đoán xem!!!
        expected = 720;
        actual = MathUtil.getFactorial(6);
        //compare
        System.out.println("6! -> expected: " + expected
                            + "; actual: " + actual);
        
        //Test case #3: check getF() with invalid argument
        //n = -5, expected = ???; -> mày phải nắm ra ngoại lệ
        //exception phải xuất hiện
        System.out.println("Check if an exception is thrown by using ivalid argument");
        MathUtil.getFactorial(-5);
        //nhìn bằng mắt tìm ngoại lệ xuất hiện
        // -> app/hàm chạy đúng như thiết kế.
    }
}
