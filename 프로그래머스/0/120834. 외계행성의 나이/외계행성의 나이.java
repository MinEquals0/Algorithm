class Solution {
    public String solution(int age) {
        // 알파벳을 배열로 담아서 그 인덱스를 활용
        // age를 인덱스로 알파벳을 가져옴
        String s = "abcdefghij";
        char[] alph = s.toCharArray();
        
        String str = String.valueOf(age);
        char[] c = str.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < c.length; i++){
            int idx = c[i] - '0';
            sb.append(alph[idx]);
        }
        
        return sb.toString();
    }
}