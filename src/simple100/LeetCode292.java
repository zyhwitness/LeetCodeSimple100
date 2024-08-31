package simple100;

import org.junit.Test;

/**
 * @Description: Nim 游戏
 * @Author: iWitness
 * @Date: 2024/8/31 15:14
 * @Version 1.0
 */
public class LeetCode292 {

    @Test
    public void test() {
        System.out.println(canWinNim(8));
    }

    /**
     * 巴什博奕，n % (m+1) != 0时，先手总是会赢的
     */
    public boolean canWinNim(int n) {
        // 1 -> 我：1  true
        // 2 -> 我：2  true
        // 3 -> 我：3  true
        // 4 -> 我：1 2 3 对手：3 2 1 false
        // 5 -> 我：1 对手：4 true
        // 6 -> 我：2 对手：4 true
        // 7 -> 我：3 对手：4 true
        // 8 -> 我：1 2 3 对手：7 6 5 false
        // 9 -> 我：1 对手：8 true
        // 10 -> 我：2 对手：8 true
        // 11 -> 我：3 对手：8 true
        // 12 -> 我：1 2 3 对手：11 10 9 false
        return n % 4 != 0;
    }
}
