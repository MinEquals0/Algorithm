class Solution {
    public int solution(String my_string, String is_prefix) {
        
        for(int i = 0; i < my_string.length(); i++){
            String s = my_string.substring(0, i);
            if(s.equals(is_prefix)){
                return 1;
            }
        }
        
        return 0;
    }
}