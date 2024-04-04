class Solution {
    public String solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        int x = 0;

        for(int i = myString.length()-1; i >= 0; i--){
            if(myString.charAt(i) == pat.charAt(pat.length()-1)) {
                x = i;
                break;
            }
        }

        for(int i = 0; i <= x; i++){
            sb.append(myString.charAt(i));
        }
        return sb.toString();
    }
}