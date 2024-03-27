class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();

        // parts에서 인덱스 가져오기
        for(int i = 0; i < parts.length; i++){
           int s = parts[i][0]; // 0,1
           int e = parts[i][1]; // 4,2
            // my_string[i]를 인덱스 s ~ e 만큼 자르기
            String str = my_strings[i];
            String part = str.substring(s,e+1);
                sb.append(part);
        }
        return sb.toString();
    }
}