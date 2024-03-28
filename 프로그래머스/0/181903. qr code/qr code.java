class Solution {
    public String solution(int q, int r, String code) {
        // code를 char 배열에 넣기 -> for문으로 char 배열을 돌면서 i % q 값이 1인지 확인
        // 1이면 그 문자를 저장
        char[] ch = code.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < ch.length; i++){
            if(i % q == r) {
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}