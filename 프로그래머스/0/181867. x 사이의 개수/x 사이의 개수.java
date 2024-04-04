class Solution {
    public int[] solution(String myString) {
        // x 을 기준으로 split - String 배열에 저장
        // 문자열 길이를 담을
        String[] str = myString.split("x");
        int[] newStr;
        if(myString.charAt(myString.length()-1) == 'x'){
            newStr = new int[str.length+1];

            for(int i = 0; i < str.length; i++){
                newStr[i] = str[i].length();
            }
            newStr[newStr.length-1] = 0;
        } else {
            newStr = new int[str.length];
            for(int i = 0; i < str.length; i++){
                newStr[i] = str[i].length();
            }
        }
        return newStr;
    }
}