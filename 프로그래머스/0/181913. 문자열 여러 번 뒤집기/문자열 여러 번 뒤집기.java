class Solution {
    public String solution(String my_string, int[][] queries) {

        
        String answer = my_string;
        
        for(int i = 0; i < queries.length; i++){
            int x = queries[i][0];
            int y = queries[i][1];
            
            String front = answer.substring(0, x);
            String mid = answer.substring(x, y+1);
            String back = answer.substring(y+1);
            
            String reversed = new StringBuilder(mid).reverse().toString();
            
            answer = front + reversed + back;
            
        }

        return answer;
    }
}