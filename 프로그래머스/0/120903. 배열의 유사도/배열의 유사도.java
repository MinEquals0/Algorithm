class Solution {
    public int solution(String[] s1, String[] s2) {
        // 이중 for문 - s1의 한 요소에 대해 s2 모든 요소 비교
        // 같은 문자열이 있으면 count++ - count변수 생성
        // count 리턴

        int count = 0;

        for(int i = 0; i < s1.length; i++){
            for(int j = 0; j < s2.length; j++){
                if(s1[i].equals(s2[j])){  // 문자열 == : 주소 비교
                    count++;
                }
            }
        }
        return count;
    }
}