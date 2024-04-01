import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        // for 문을 돌면서 if문 사용해서 query의 요소가 짝,홀 구별
        // 짝 - 인덱스를 제외한 뒷부분 제거
        // 홀 - 인덱스 제외한 앞부분 제거
        for(int i = 0; i < query.length; i++){
            if(i % 2 == 0){ 
                arr = Arrays.copyOfRange(arr,0,query[i]+1);
            } else {
                arr = Arrays.copyOfRange(arr,query[i],arr.length); 
            }
        }
        return arr;
    }
}