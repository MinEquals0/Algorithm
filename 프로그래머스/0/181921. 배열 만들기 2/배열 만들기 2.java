import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        int count = 0;

        for(int i = l; i <= r; i++) {
            // 문자열로 변환
            String str = String.valueOf(i);
            boolean isAdd = true;
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch != '0' && ch != '5') {
                    isAdd = false;
                    break;
                }
            }

            if (isAdd) {
                answer.add(i);
            }
        }

        if(answer.size() == 0) {
            answer.add(-1);
        }

        int[] newArr = answer.stream().mapToInt(Integer::intValue).toArray();
        return newArr;
    }
    
}
