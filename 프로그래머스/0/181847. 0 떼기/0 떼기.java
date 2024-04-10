class Solution {
    public String solution(String n_str) {
        // for문 사용, 조건 0이 아닌 숫자가 나올 때까지 돌아서 0이 아닌 수가 나오는 인덱스 알아내기
        // for문 범위 알아낸 인덱스 ~ n_str 끝까지
        // String -> int 변환
        // 문자열을 저장할 StringBuilder 생성
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for(int i = 0; i < n_str.length(); i++){
            if(n_str.charAt(i) > '0') { 
                idx = i;
                break;
            }
        }

        for(int i = idx; i < n_str.length(); i++){
            sb.append(n_str.charAt(i));
        }

        return sb.toString();
    }
}