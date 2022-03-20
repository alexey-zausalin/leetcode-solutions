package jewels_and_stones;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

    public int numJewelsInStonesRawJava(String jewels, String stones) {
        Set<Character> jewelsSst = new HashSet<>();
        for (char jewel:
                jewels.toCharArray()) {
            jewelsSst.add(jewel);
        }

        int num = 0;
        for (char stone :
                stones.toCharArray()) {
            if (jewelsSst.contains(stone)) {
                num++;
            }

        }

        return num;
    }

    public int numJewelsInStonesUsingStreams(String jewels, String stones) {
        Set<Character> jewelsSst = jewels.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toSet());

        return stones.chars()
                .reduce(0, (num, e) -> num + (jewelsSst.contains((char)e) ? 1 : 0 ));
    }
}
