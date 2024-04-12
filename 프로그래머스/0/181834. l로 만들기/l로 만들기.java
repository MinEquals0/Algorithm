class Solution {
    public String solution(String myString) {
        // I 보다 앞서는 알파벳을 I로 치환
        // myString 문자열을 char[] 변환
        // char[]을 for문으로 돌면서 한글자씩 I보다 앞선 글자인지 확인 - if
        // < 'l'

        char[] ch = myString.toCharArray();

        for(int i = 0; i < ch.length; i++){
            if(ch[i] < 'l'){
                ch[i] = 'l';
            }
        }
        return new String(ch);
    }
}