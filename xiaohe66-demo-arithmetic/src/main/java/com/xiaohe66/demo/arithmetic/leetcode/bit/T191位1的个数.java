package com.xiaohe66.demo.arithmetic.leetcode.bit;

/**
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 * <p>
 *  
 * <p>
 * 提示：
 * 请注意，在某些语言（如 Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，
 * 并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。
 * 在 Java 中，编译器使用二进制补码记法来表示有符号整数。因此，在上面的 示例 3 中，输入表示有符号整数 -3。
 *  
 * <p>
 * 示例 1：
 * 输入：00000000000000000000000000001011
 * 输出：3
 * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
 *
 * <p>
 * 示例 2：
 * 输入：00000000000000000000000010000000
 * 输出：1
 * 解释：输入的二进制串 00000000000000000000000010000000 中，共有一位为 '1'。
 *
 * <p>
 * 示例 3：
 * 输入：11111111111111111111111111111101
 * 输出：31
 * 解释：输入的二进制串 11111111111111111111111111111101 中，共有 31 位为 '1'。
 *  
 * <p>
 * 提示：
 * 输入必须是长度为 32 的 二进制串 。
 *  
 * <p>
 * 进阶：
 * 如果多次调用这个函数，你将如何优化你的算法？
 *
 * <p>
 * 通过次数133,473提交次数182,310
 *
 * @author xiaohe
 * @time 2021.03.22 15:48
 */
public class T191位1的个数 {


    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了95.76%的用户
     * 内存消耗：35.2 MB, 在所有 Java 提交中击败了89.68%的用户
     */
    public int hammingWeight(int n) {

        int tmp = n;

        if (n < 0) {
            if (n == Integer.MIN_VALUE) {
                return 1;
            }
            int qty = 32;
            while (tmp != -1) {

                if ((tmp & 1) == 0) {
                    qty--;
                }
                tmp = tmp >> 1;
            }
            return qty;

        } else {
            int qty = 0;
            while (tmp != 0) {

                qty += tmp & 1;
                tmp = tmp >> 1;
            }
            return qty;
        }

    }

}
