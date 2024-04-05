class Solution {
    public String solution(String rny_string) {
        int count = 0;
        int idx = 0;

        for(int i = 0; i < rny_string.length(); i++){
            if(rny_string.charAt(i) == 'm'){
                count++;
            }
        }

        char[] ch = new char[rny_string.length()+count];

        for(int i = 0; i < rny_string.length(); i++){ // 문자열에서 한글자씩 가져와서 m인지 확인하는 거니까 문자열 길이만큼
            if(rny_string.charAt(i) == 'm'){
                ch[idx++] = 'r'; // char는 글자 하나만 가능!
                ch[idx++] = 'n';
            } else {
                ch[idx++] = rny_string.charAt(i);
            }
        }
        return new String(ch);
    }
}