package simple100;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Description: 同构字符串
 * @Author: iWitness
 * @Date: 2024/8/21 22:29
 * @Version 1.0
 */
public class LeetCode205 {

    @Test
    public void test() {
        System.out.println(isIsomorphic("badc", "baba"));
    }

    public boolean isIsomorphic(String s, String t) {
        Map<String, String> mapS = new HashMap<>();
        Map<String, String> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String sI = s.charAt(i) + "";
            String tI = t.charAt(i) + "";
            if (mapS.containsKey(sI) && !Objects.equals(mapS.get(sI), tI)) {
                return false;
            }
            if (mapT.containsKey(tI) && !Objects.equals(mapT.get(tI), sI)) {
                return false;
            }
            mapS.put(sI, tI);
            mapT.put(tI, sI);
        }

        System.out.println("------");

        return true;
    }
}
