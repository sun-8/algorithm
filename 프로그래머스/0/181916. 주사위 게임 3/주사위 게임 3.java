import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> diceMatch = new HashMap<>();
        List<Integer> diceArr = Arrays.asList(a, b, c, d);
        int answer = 0;

        for(Integer dice : diceArr) {
            if(diceMatch.containsKey(dice)) {
                diceMatch.put(dice, (diceMatch.get(dice) == null ? 0 : diceMatch.get(dice)) +1);
            } else {
                diceMatch.put(dice, 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry : diceMatch.entrySet()) {
            if (entry.getValue() == 4) {
                return 1111 * entry.getKey();
            } else if (entry.getValue() == 3) {
                int findDice1 = findMatchDice(diceMatch, 1, 0);
                return (10 * entry.getKey() + findDice1) * (10 * entry.getKey() + findDice1);
            } else if (entry.getValue() == 2) {
                int findDice2 = findMatchDice(diceMatch, 2, entry.getKey());
                if(findDice2 == 0) {
                    int findDice_1 = findMatchDice(diceMatch, 1, 0);
                    int findDice_2 = findMatchDice(diceMatch, 1, findDice_1);
                    return findDice_1 * findDice_2;
                } else {
                    return (entry.getKey() + findDice2) * Math.abs(entry.getKey() - findDice2);
                }
            } else if (entry.getValue() == 1) {
                int findDice3 = findMatchDice(diceMatch, 3, 0);
                if(findDice3 == 0) {
                    int findDice2 = findMatchDice(diceMatch, 2, entry.getKey());
                    if(findDice2 == 0) {
                        return Math.min(a, Math.min(b, Math.min(c, d)));
                    } else {
                        int findDice1 = findMatchDice(diceMatch, 1, entry.getKey());
                        return entry.getKey() * findDice1;
                    }
                } else {
                    return (10 * findDice3 + entry.getKey()) * (10 * findDice3 + entry.getKey());
                }
            }
        }
        
        return answer;
    }
    
    
    public int findMatchDice(Map<Integer, Integer> diceMatch, int matchNumber, int notContainKey) {
        for(Map.Entry<Integer, Integer> find : diceMatch.entrySet()) {
            if (find.getKey() != notContainKey && find.getValue() == matchNumber) {
                return find.getKey();
            }
        }
        return 0;
    }
    
}