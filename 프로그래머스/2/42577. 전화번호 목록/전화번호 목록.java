import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
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
        
        
        
        
        // 테스트 케이스 틀린 것 있음. 왜?
        // for(String s : phone_book) {
        //     for(int i=0; i<phone_book.length; i++) {
        //         if (!s.equals(phone_book[i]) && s.contains(phone_book[i])) {
        //             return false;
        //         }
        //     }
        // }
        // return true;
        
        
        // 테스트 케이스 틀린 것 있음. 왜?
        // for(String s : phone_book) {
        //     for(int i=0; i<phone_book.length; i++) {
        //         if (s.equals(phone_book[i])) {
        //             continue;
        //         } else if (s.contains(phone_book[i])) {
        //             return false;
        //             // break; 왜 런타임 에러?
        //         }
        //     }
        // }
        // return true;
        
        
//         HashMap<String, Boolean> map = new HashMap<>();

//         // 전화번호를 해시맵에 추가
//         for (String phoneNumber : phone_book) {
//             map.put(phoneNumber, true);
//         }

//         // 각 전화번호가 다른 전화번호의 접두어인지 확인
//         for (String phoneNumber : phone_book) {
//             for (int i = 1; i < phoneNumber.length(); i++) {
//                 String prefix = phoneNumber.substring(0, i);
//                 if (map.containsKey(prefix)) {
//                     // 다른 번호의 접두어인 경우가 있으면 false 반환
//                     return false;
//                 }
//             }
//         }

//         // 어떤 번호가 다른 번호의 접두어가 아닌 경우 true 반환
//         return true;
    }
}