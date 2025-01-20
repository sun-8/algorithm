import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {

        /* 최종 제출 코드*/
        HashMap<String, String> map = new HashMap<>();
        for (String s : phone_book) {
            map.put(s, s);
        }
        for (Map.Entry<String, String> m : map.entrySet()) {
            for(int i=0; i<m.getKey().length(); i++) {
                String subS = m.getKey().substring(0, i);
                if (map.containsKey(subS)) {
                    return false;
                }
            }
        }
        return true;
        

        /* 다른 코드 (Map.Entry 사용X) */
        // HashMap<String, Boolean> map = new HashMap<>();
        // for (String phoneNumber : phone_book) {
        //     map.put(phoneNumber, true);
        // }
        // for (String phoneNumber : phone_book) {
        //     for (int i = 1; i < phoneNumber.length(); i++) {
        //         String prefix = phoneNumber.substring(0, i);
        //         if (map.containsKey(prefix)) {
        //             return false;
        //         }
        //     }
        // }
        // return true;
        
        
        /* 테스트 케이스 틀린 것 있음. 왜? */
        // for(String s : phone_book) {
        //     for(int i=0; i<phone_book.length; i++) {
        //         if (s.equals(phone_book[i])) {
        //             continue;
        //         } else if (s.contains(phone_book[i])) {
        //             return false;
        //         }
        //     }
        // }
        // return true;
        /* 
        문제점 1.
            접두사(prefix)는 문자열이 다른 문자열의 맨 앞부분에 위치해야 한다는 조건을 만족
            contains는 인자값으로 된 문자열이 포함되는지 확인하는 함수이다.
            하지만 이 문제에서 요구하는 것은 "한 번호가 다른 번호의 접두사인지"를 확인하는 것이기 때문에
            "345"은 "12345"에 포함되지만 접두사는 아니기에 틀린 케이스가 있다.

            수정된 코드
            for(String s : phone_book) {
                for(int i=0; i<phone_book.length; i++) {
                    if (s.equals(phone_book[i])) {
                        continue;
                    } else if (s.startsWith(phone_book[i])) {
                        return false;
                    }
                }
            }
            return true;

        문제점 2.
            시간복잡도가 너무 오래걸린다.
            phone_book의 크기는 1 이상 1,000,000 이하 / 각 전화번호의 길이는 1 이상 20 이하
            아래의 코드는 2중 for문이기에 O(n)*O(n) = 1,000,000 * 1,000,000 시간 넘나 오래걸림
            반면 위에 제출한 코드는 2중 for문이긴 하지만 O(n)*O(m) = 1,000,000 * 20 이라 시간이 적게 걸림
        */
    }
}
