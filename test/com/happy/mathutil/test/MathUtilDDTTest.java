/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.happy.mathutil.test;

import static com.happy.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    //ta cần test getF() bên code chính.
    //3 việc: cb data, đưa data vào hàm, kết luận đúng sai
    //DONE nhưng rối.
    
    //0!, 0 -> 1
    //1!, 1 -> 1       bộ dữ liệu test, test data
    //2!, 2 -> 2       lưu table SQLServer, Excel, .CSV
    //3!, 3 -> 6       lưu trong một mảng trong code cũng okie
    //5!, 5 -> 120
    //6!, 6 -> 720
    //mảng 2 chiều [6][2]
    
    //học cách tách data ra khỏi các câu lệnh.
    //getF(), ko mix. tất cả các framework UnitTest của mọi 
    //NNLT đều làm được điều này!!!
    
    //hàm trả về mảng 2 chiều kiểu Object
    // vì các framework chơi với Object, mảng số nguyên cũng
    //phả hiểu là object, tức là chơi với Wrapper Class nếu là mảng số
    //Wrapper class: Integer (int), Character (char), Long (long)
    @Parameterized.Parameters //Báo JVM JUnit đây là data nguồn
    public static Object[][] initData() {
        return new Integer[][] {
            {0,1},
            {1,1},
            {2,2},
            {3,6},
            {6,720}
        };
    }
    
    //cần trích data từ mảng ra để được cặp value input/expected
    @Parameterized.Parameter(value = 0)   //map cột 0
    public int input;
    
    @Parameterized.Parameter(value = 1)   //map cột 1
    public int expected;
    
    @Test
    public void testFactorialGivenValidArgumentReturnsWell() {
        assertEquals(expected, getFactorial(input));
    }
}
