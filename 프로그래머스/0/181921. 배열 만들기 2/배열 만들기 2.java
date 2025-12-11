import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = l; i <= r; i++){
            String s = String.valueOf(i);
            StringBuilder sb = new StringBuilder(s);

            for (int j = 0; j < sb.length(); j++) {
                char c = sb.charAt(j);
                if (c == '0' || c == '5') {
                    sb.deleteCharAt(j);  
                    j--;
                }
            }

            if(sb.length() == 0){
                list.add(i);
            }
            
        }
        
        
        if(list.isEmpty()){
            return new int[]{-1};
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}