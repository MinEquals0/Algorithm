class Solution {
    
    public String solution(String my_string, int[][] queries) {
        char[] ch = my_string.toCharArray();
        
        for(int[] q : queries){
            int s = q[0];
            int e = q[1];
            reverse(ch,s,e);
        }
        return new String(ch);
    }
    
    void reverse(char[] ch, int s, int e){
        int mid = (s + e + 1) / 2;
        
        while(s < mid){
            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;
            
            s++;
            e--;
        }
    }
}