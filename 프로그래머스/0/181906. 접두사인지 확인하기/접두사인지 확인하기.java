class Solution {
    public int solution(String my_string, String is_prefix) {
        // 제한 조건
        if(is_prefix.length() > my_string.length()){
            return 0;
        }

        // my_string으로 만들 수 있는 모든 접두사 -> 새 배열에 담기
        String[] prefixArr = new String[my_string.length()];

        for(int i = 1; i < my_string.length(); i++){
            String str = my_string.substring(0,i);
            prefixArr[i-1] = str;
        }

        // 새 배열을 돌면서 is_prefix가 있는지 확인
        for(String s : prefixArr){
            if(is_prefix.equals(s)) {
                return 1;
            }
        }
        return 0;
    }
}