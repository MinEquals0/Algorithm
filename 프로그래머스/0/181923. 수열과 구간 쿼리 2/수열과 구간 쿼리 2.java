import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // 1. List 이용
        /* List<Integer> list = new ArrayList<>();
        
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
        */

        // 2. 배열
        int qLen = queries.length;
        int[] answer = new int[qLen];
        
        for(int i = 0; i < qLen; i++){
             int minValue = Integer.MAX_VALUE;
             int s = queries[i][0];
             int e = queries[i][1];
             int k = queries[i][2];
            
            for(int j = s; j <= e; j++){ 
                  if(arr[j] > k && arr[j] < minValue){
                      minValue = arr[j];
                  } 
            } 
            
            answer[i] = minValue == Integer.MAX_VALUE ? -1 : minValue;
       }
        
        return answer;
    }
}
