class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        StringBuilder newStr = new StringBuilder();
        String fir = "";
        String end = "";
        
        // 문자열 자르기 -> 뒤집기
        if(s > 0) {
            fir = my_string.substring(0,s);
        }

        if(e < my_string.length()) {
            end = my_string.substring(e+1,my_string.length());
        }

        String part = my_string.substring(s,e+1);
        sb.append(part).reverse();

        // 0-s + 뒤집은 문자열 + e~length
        newStr.append(fir).append(sb).append(end);
        return newStr.toString();
    }
}