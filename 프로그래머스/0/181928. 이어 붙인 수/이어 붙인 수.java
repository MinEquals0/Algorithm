class Solution {
    public int solution(int[] num_list) {
        String num1 = "";
        String num2 = "";
        
        for(int i : num_list){
            if(i % 2 == 0) {
                num1 += Integer.toString(i);
            } else {
                num2 += Integer.toString(i);
            }
        }
        
        int answer = Integer.parseInt(num1) + Integer.parseInt(num2);
        
        return answer;
    }
}