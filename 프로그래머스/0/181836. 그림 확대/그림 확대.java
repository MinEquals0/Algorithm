import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < picture.length; i++) {
            char[] ch = picture[i].toCharArray();

            for(int m = 0; m < k ; m++){
                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < ch.length; j++) {
                    for (int n = 0; n < k; n++) {
                        sb.append(ch[j]);
                    }
                }
                // sb을 문자열로 바꿔서 String[]에 넣어주기
                String str = sb.toString();
                list.add(str);
            }
        }
        return list.toArray(new String[]{});
    }
}
