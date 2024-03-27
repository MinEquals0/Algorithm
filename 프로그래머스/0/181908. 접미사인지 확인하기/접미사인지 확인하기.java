class Solution {
    public int solution(String my_string, String is_suffix) {
        StringBuilder sb = new StringBuilder();
        // my_string으로 만들 수 있는 suffix 모두 생성 -> 배열에 저장
        int len = my_string.length();
        String[] arr = new String[len];

        // 예외 케이스 
        if(is_suffix.length() > my_string.length()){
            return 0;
        }

        for(int i = 0; i < len; i++){
            String str = my_string.substring(i,len);
            arr[i] = str;
        }
        // is_suffix가 배열에 있는 요소인지 확인 - 인덱스 조심하기
        int sufLen = is_suffix.length();
        return arr[len - sufLen].equals(is_suffix) ? 1 : 0;
    }
}