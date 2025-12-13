import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < queries.length; i++){
             int minValue = Integer.MAX_VALUE;
             int s = queries[i][0];
             int e = queries[i][1];
             int k = queries[i][2];
            
            for(int j = s; j <= e; j++){ 
                  if(k < arr[j]){
                      minValue = Math.min(minValue, arr[j]);
                  } 
            } 
            
            if(minValue == Integer.MAX_VALUE){
                list.add(-1);
            } else {
                list.add(minValue);
            }
       }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
