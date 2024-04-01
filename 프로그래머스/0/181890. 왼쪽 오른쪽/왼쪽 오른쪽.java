import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        // for문으로 배열을 돌면서 l,r이 나올 경우 - if
        // if 문안에 break 이 있어야 함 -> return 해주면 break를 할 필요가 없구나
        // 없을 때 빈리스트 리턴

        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")){
                return Arrays.copyOfRange(str_list,0,i);
            } else if(str_list[i].equals("r")){
                // 오른쪽 문자열 담고 리턴
                return Arrays.copyOfRange(str_list,i+1,str_list.length);
            }
        }
        return new String[]{};
    }
}