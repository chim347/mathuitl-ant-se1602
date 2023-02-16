/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.jenda.mathutil.main;

import com.jenda.mathutil.core.MathUtility;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //testFactorialGivenWrongArgumentThrowsException();
        testFactorialGivenRightArgumrntRunsWell();
    }

    // thiết kế hàm getF() chỉ tính n! từ 0 - 20
    // nếu đưa n < 0 hoặc n> 20 thì hàm sẽ ko tính, chửi băng cách ném ra exception
    
    // thực tế hàm getF() khi chạy có làm được như thiết kế hay ko
    // phải test thử mới bt đc
    public static void testFactorialGivenWrongArgumentThrowsException() {
        // Test case 4: test getF() with n = 5, wrong argument 
        // Exception value: an exception is thrown IllegalArgumentException
        System.out.println("Test -5! expected = Illegal Argument Exception");
        MathUtility.getFactorial(-5);

    }

    // dân dev phải có trách nhiệm viết code của mình đúng hay sai
    // trước khi lắp ráp nó với các class khác để tạo nên các chức năng
    // cos nhiều quy tắc đặt tên hàm cho việc kiểm thủ hàm, thường tên 
    // hàm sẽ bao gồm hàm ý nghĩa của việc kiểm thử
    // ví dụ hàm dưới này sẽ dùng để test cái hàm tính giai thừa
    // trong tình huống - case đưa n đsung chuẩn, thì ta hy vọng - excepted
    // hàm này chạy ngon như thiết kế, visdu: n = 5 thì hàm này trẻ về 120
    // tức là 5! hy vọng hàm tính ra 120
    public static void testFactorialGivenRightArgumrntRunsWell() {
        // Test Case #1: Test getFactorial with n = 0
        // Expected value: 1 - hy vọng đưa n = 0 vào thù hàm trả về 1
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);

        System.out.println("Test " + n + "!" + " expected = " + expectedValue
                + " | actual : " + actualValue);

        // test case2: Test getFactorial() with n = 1;
        // Expected value = 1 - hy vong 1! app trả về 1
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n);
        System.out.println("Test " + n + "!" + " expected = " + expectedValue
                + " | actual : " + actualValue);

        // test case 3: Test getFactorial(3) 
        // Expected value = 6!!!
        System.out.println("Test 3!: expected = 6"
                + " | actual : " + MathUtility.getFactorial(3));
    }

}
