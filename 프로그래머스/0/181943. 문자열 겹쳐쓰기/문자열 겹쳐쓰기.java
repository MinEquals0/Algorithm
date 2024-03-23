class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        int end = Math.min(s + overwrite_string.length(), my_string.length());
        answer = my_string.substring(0,s) + overwrite_string;
        
        if(end < my_string.length()){
            answer += my_string.substring(end);
        }
        
        
        return answer;
        
    }
}