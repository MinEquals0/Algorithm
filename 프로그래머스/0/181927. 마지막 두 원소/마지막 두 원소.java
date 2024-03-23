class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int len = num_list.length;
        int last = len-1;
        
        System.arraycopy(num_list, 0, answer, 0, num_list.length);
        
        if(num_list[last-1] < num_list[last]) {
            int sub = num_list[last] - num_list[last-1];
            answer[last+1] = sub;
        } else {
            int multi = num_list[last] * 2;
            answer[last+1] = multi;
        }
        
        return answer;
    }
}