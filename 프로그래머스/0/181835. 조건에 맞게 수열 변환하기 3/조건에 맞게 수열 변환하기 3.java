class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        int idx = 0;
        
        for(int i : arr){
            if(k % 2 == 0){
                answer[idx] = i + k;
            } else {
                answer[idx] = i * k;
            }  
            idx++;
            
        }
        return answer;
    }
}