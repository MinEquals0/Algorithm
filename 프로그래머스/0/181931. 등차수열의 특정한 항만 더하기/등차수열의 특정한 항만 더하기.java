class Solution {
    public int solution(int a, int d, boolean[] included) {
        int total = 0;
        
        // 불리언 배열 돌면서 i 값 구하기
        for(int i = 0; i < included.length; i++){
            if(included[i] == true) {
                int seq = a + ((i+1)- 1) * d; 
                total += seq;
            } 
        } 
        
        return total;
    }
}
// a1, d로 등차수열 만들기 -> 불리언 배열 길이
// 불리언 배열에서 true 값이 있는 인덱스 -> 등차수열에서 i+1 항 값 더하기
// 0 3 4 -> 1 4 5 => 7 15 19 = 17
