class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder();
        char c = alp.charAt(0);
        
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) == c){
                sb.append(alp.toUpperCase());
            } else {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}