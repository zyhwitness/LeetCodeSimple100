package simple100review3;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 快乐数-review3
 * @Author: iWitness
 * @Date: 2025/4/1 14:40
 * @Version 1.0
 */
public class LeetCode202Review3 {

//    「快乐数」 定义为：
//
//    对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
//    然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
//    如果这个过程 结果为 1，那么这个数就是快乐数。
//    如果 n 是 快乐数 就返回 true ；不是，则返回 false 。

    @Test
    public void test() {
        System.out.println(isHappy(2));
    }

    public boolean isHappy(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        while (sum != 1 && !set.contains(sum)) {
            set.add(sum);
            sum = 0;
            for (int i = 0; i < s.length(); i++) {
                int parseInt = Integer.parseInt(String.valueOf(s.charAt(i)));
                sum = sum + parseInt * parseInt;
            }
            s = String.valueOf(sum);
        }
        return sum == 1;
    }

    public boolean isHappy1(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getSumOfSquares(n);
        }
        return n == 1;
    }

    private int getSumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}

// 还是利用 HashSet 中元素的唯一性，每次计算后判断 set 中是否已存在