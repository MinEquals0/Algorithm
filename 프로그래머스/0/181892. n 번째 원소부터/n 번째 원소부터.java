import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        //copyofRange를 이용 -> num_list 에 n-1 인덱스부터 num_list.length까지 복사 리턴
        return Arrays.copyOfRange(num_list,n-1,num_list.length);
    }
}