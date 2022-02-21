/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.happy.mathutil.test;

import static com.happy.mathutil.core.MathUtil.*;
import org.junit.Test;
import static org.junit.Assert.*;

//nếu muốn xài các hàm static, có 2 cách:
//C1: gọi tên class.tên hàm static() truyền thống 100 năm nay
//      (nhớ import package...tên class chứa hàm static)
//C2: không thèm gọi tên class. , gọi tên hàm giống C
//      (nhớ import static package...tên class.tên hàm static ko ngoặc)
//                                            .* lôi hết static ra


public class MathUtilTest {
    //Test case #1: check getF() with valid argument
    //n = 0, expected = 1; actual: đoán xem!!!
    @Test //@Test biến 1 hàm bất kỳ thành main()
    public void testFactorialGivenValidArgumentReturnsWell() {
        long expected = 1; //hy vọng hàm bằng 1 nếu tính 0!
        long actual = getFactorial(0);
        
        assertEquals(expected, actual);
        //~~~ Main cũ: phải nhìn bằng mắt.
        //bên Junit: tung 2 màu xanh đỏ.
    }
    
    //Test case #2: check getF() with valid argument
    //n = 6, expected = 720; actual: đoán xem!!!
    @Test
    public void testFactorialGivenValidArgumentN6ReturnsWell() {
        long expected = 720; //hy vọng hàm bằng 720 nếu tính 6!
        long actual = getFactorial(6);
        
        assertEquals(expected, actual);
    }
    
    
    ////TEST NGOẠI LỆ
    // NGOẠI LỆ KHÔNG PHẢI LÀ 1 VALUE, MÀ LÀ 1 TÌNH HUỐNG BẤT THƯỜNG
    // Không dùng assertEquals()
    // Đo lường bằng cách coi mày có xuất hiện hay không?
    @Test(expected = IllegalArgumentException.class)
    //Test case #3: getF() with invalid argument
    // n = -5, expected = ngoại lệ xuất hiện!!!
    public void testFactorialGivenInvalidArgumentThrowsException() {
        getFactorial(-5);
    }
}
