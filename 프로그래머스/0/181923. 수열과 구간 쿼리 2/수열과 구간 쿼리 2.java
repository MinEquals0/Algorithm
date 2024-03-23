import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int[] q : queries){
            int start = q[0];
            int end = q[1];
            int compareTo = q[2];

             int min = Integer.MAX_VALUE;

            for(int i = start; i <= end; i++) {
                if(arr[i] > compareTo){
                    min = Math.min(min, arr[i]);
                } 
            }
            
            if (min == Integer.MAX_VALUE) {
                answer.add(-1); 
            } else {
                answer.add(min); 
            }
        }

        int[] finalArr = answer.stream().mapToInt(Integer::intValue).toArray();

        return finalArr;
    }
}
