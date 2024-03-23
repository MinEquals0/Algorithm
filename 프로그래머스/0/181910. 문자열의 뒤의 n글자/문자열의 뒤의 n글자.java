class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        char[] ch = my_string.toCharArray();
        int len = ch.length;

        for(int i = len-n; i < len; i++){
            sb.append(ch[i]);
        }
        return new String(sb);
    }
}