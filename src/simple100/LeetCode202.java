package simple100;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 快乐数
 * @Author: iWitness
 * @Date: 2024/8/20 18:50
 * @Version 1.0
 */
public class LeetCode202 {

    @Test
    public void test() {
        System.out.println(isHappy(7));
    }

    public boolean isHappy(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        Set<String> set = new HashSet<>();
        while (sum != 1) {
            set.add(s);
            for (int i = 0; i < s.length(); i++) {
                Integer parseInt = Integer.valueOf(s.charAt(i) + "");
                sum += parseInt * parseInt;
            }
            if (sum == 1) {
                return true;
            } else {
                s = String.valueOf(sum);
                sum = 0;
                if (set.contains(s)) {
                    return false;
                }
            }
        }
        return false;
    }
}
