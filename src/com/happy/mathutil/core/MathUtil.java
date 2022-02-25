/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.happy.mathutil.core;

/**
 *
 * @author Admin
 */

//Class này cung cấp các hàm toán học giúp cho các class khác sử dụng
//Ví dụ app Calculator cần rất nhiều hàm toán học
//Cái gì là tiện ích dùng chung -> nên được design là static
public class MathUtil {
    //hàm tính n giai thừa n! = 1.2.3.4...n
    //không có giai thừa số âm
    //0! = 1! = 1 (quy ước)
    //giai thừa tăng rất nhanh, 20! vừa đủ cho long
    //chặn việc 0 < n < 21
    public static long getFactorial(int n) {
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. "
                    + "n must be between 0 to 20");
        
        if (n == 0 || n == 1)
            return 1;
        
        //sống sót đến đây, chắc kèo n = 2..20
        long product = 1; // kết quả trung gian
        for (int i = 2; i <= n; i++)
            product *= i;
        
        return product;
    }
}
