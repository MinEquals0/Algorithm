class Solution {
    public int[] solution(String my_string) {
        // 새 배열 생성(52) -> 처음 - 'A' -> 'Z' 까지
        // 조건 변경 -> - 'a'
        int[] arr = new int[52];

        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(Character.isUpperCase(c)){ // 대문자 확인하는 메서드
                int n = c - 'A';
                arr[n]++;

            } else {
                // 소문자일떄
                int n = c - 'a';
                arr[n+26]++;
            }
        }
        return arr;
    }
}