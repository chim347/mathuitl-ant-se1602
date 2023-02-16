/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.jenda.mathutil.core.test;

import com.jenda.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ADMIN
 */
public class MathUtilityTest {

    // trong hàm này sẽ chứa các test case để test các getF()
    // với n hợp lệ trong khoảng 0 ... 20
    // kiểm thử ngoại lệ thì sao?
    // tức là hàm getF() được thiết kế rẳng nếu đưa n cà chớn
    // thì hàm phải ném ra ngoại lệ!!!
    // tức là getF(-5) thì expected == ngoại lệ Illegal argument exception
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentReturnsWell() {
        // test case5: getF() with a wrong arg: n = -5
        //Except result: an exception is throw: Illegal argument
        MathUtility.getFactorial(-5);
        // nếu chỉ gõ lên trên thì bị màu đỏ, do lện này gây ra exception
        // màu đỏ, nhưng hàm này ki vọng ra exception
        // nếu có exception thì này đúng như thiết kế thì phải xanh chứ
        // lỗi của ta là ko đo, ko so sánh, chưa nhận diện là đã có 
        // ngoại lệ rồi
        // ta cần thêm 1 câu lệnh đã có ngoại lệ chưa????
        // có rồi -> xanh
        // chưa -> đỏ
        // Junit 4 ko dùng hàm để đo ngoại lệ
        // jUNIT 5 thì có hàm dùng để do ngoại lệ
    }
    
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {

        // test case 1: test getF() with n = 0
        // Expected rs = 1    0! = 1
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);

        Assert.assertEquals(expectedValue, actualValue);

        // Test case 2: test getF() n = 5
        // Expected rs = 120; hy vọng 5! = 120
        Assert.assertEquals(120, MathUtility.getFactorial(5));

        // Test case 3: test getF() n = 6; expect = 720
        Assert.assertEquals(720, MathUtility.getFactorial(6));
        
        // Test case 4: test getF() n = 4; expect = 24
        Assert.assertEquals(24, MathUtility.getFactorial(4));
    }

}
