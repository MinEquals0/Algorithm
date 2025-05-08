class Solution {
    public String[] solution(String my_str, int n) {
        int len = (int) Math.ceil((double)my_str.length()/n);
        String[] answer = new String[len];
        int idx = 0;
        
        for(int i = 0; i < my_str.length(); i+=n){
            int end = Math.min(i+n, my_str.length());
            answer[idx] = my_str.substring(i, end); 
            idx++;
        }
        
        return answer;
    }
}