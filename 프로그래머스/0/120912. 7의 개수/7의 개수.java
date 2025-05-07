class Solution {
    public int solution(int[] array) {
        StringBuilder sb = new StringBuilder();
        
        for(int i : array){
            sb.append(i);
        }
        
        int cnt = 0;
        
        for(int i = 0; i < sb.length(); i++){
           if(sb.charAt(i) == '7'){
               cnt++;
           } 
        }
        
        return cnt;
    }
}