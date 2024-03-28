import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
       // 이중 배열로 값을 담기 -> c열에 있는 값 for문 돌면서 sb에 담기
        int a = (int) Math.ceil(my_string.length()/(double) m); // 올림
        char[][] arr = new char[a][m];
        StringBuilder sb = new StringBuilder();

        int idx = 0; // 문자열을 가리키는 인덱스
        for(int i = 0; i < a; i++){
            for(int j = 0; j < m; j++){
                if(idx >= my_string.length()) { // 인덱스 제한 조건 걸기
                    break;
                }
                    arr[i][j] = my_string.charAt(idx);
                    idx++;
            }
        }
       for(int i = 0; i < arr.length; i++){
           sb.append(arr[i][c-1]); // c열의 인덱스 : c-1
       }
       return sb.toString();
    }
}