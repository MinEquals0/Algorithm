class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len + 1];
        int idx = 0;
        
        for(int i : num_list){
            answer[idx] = i;
            idx++;
        }
        
        if(num_list[len-1] > num_list[len-2]){
            answer[len] = num_list[len-1] - num_list[len-2];
        } else {
            answer[len] = num_list[len-1] * 2;
                        
        }
        
        return answer;
    }
}