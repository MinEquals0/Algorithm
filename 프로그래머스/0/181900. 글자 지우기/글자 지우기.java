class Solution {
    public String solution(String my_string, int[] indices) {
        // 불리언 배열을 만들어서 indices에 있는 요소를 인덱스번호로 해서 F -> T
        // 불리언 배열을 돌면서 T일 때만 문자열 추가
        StringBuilder sb = new StringBuilder();
        boolean[] b = new boolean[my_string.length()];

        for(int i = 0; i < indices.length; i++){
            int index = indices[i];
            b[index] = true;
        }

        for(int i = 0; i < b.length; i++) {
            if(!b[i]) {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}