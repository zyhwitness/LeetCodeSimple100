package simple100review3;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Description: 同构字符串-review3
 * @Author: iWitness
 * @Date: 2025/4/1 15:18
 * @Version 1.0
 */
public class LeetCode205Review3 {

//    给定两个字符串 s 和 t ，判断它们是否是同构的。
//
//    如果 s 中的字符可以按某种映射关系替换得到 t ，那么这两个字符串是同构的。
//
//    每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身。

    @Test
    public void test() {
        System.out.println(isIsomorphic("baba", "cdad"));
    }

    public boolean isIsomorphic(String s, String t) {
        Map<String, String> mapS = new HashMap<>();
        Map<String, String> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            String sI = String.valueOf(s.charAt(i));
            String tI = String.valueOf(t.charAt(i));

            if (mapS.containsKey(sI) && !Objects.equals(mapS.get(sI), tI)) {
                return false;
            }
            if (mapT.containsKey(tI) && !Objects.equals(mapT.get(tI), sI)) {
                return false;
            }
            mapS.put(sI, tI);
            mapT.put(tI, sI);
        }
        return true;
    }
}
