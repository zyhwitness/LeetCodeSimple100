package simple100review3;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description: 反转字符串中的单词-review3
 * @Author: iWitness
 * @Date: 2025/3/28 15:01
 * @Version 1.0
 */
public class LeetCode151Review3 {

    @Test
    public void test() {
        System.out.println(reverseWords("  hello world  "));
    }

    public String reverseWords(String s) {
        String reverse = "";
        List<String> list = Arrays.asList(s.split(" "));
        System.out.println(list);
        List<String> collect = list.stream().filter(s1 -> !s1.isEmpty())
                .collect(Collectors.toList());
        System.out.println(collect);

        for (int i = collect.size() - 1; i >= 0; i--) {
            reverse = reverse + collect.get(i) + " ";
        }

        return reverse.substring(0, reverse.length() - 1);
    }

    public String reverseWords1(String s) {
        String reverse = "";
        List<String> list = Arrays.asList(s.split(" "));

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).trim().isEmpty()) {
                continue;
            }
            reverse = reverse + list.get(i) + " ";
        }

        return reverse.substring(0, reverse.length() - 1);
    }
}
