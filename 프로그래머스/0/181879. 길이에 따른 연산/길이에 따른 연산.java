class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int multi = 1;
        int len = num_list.length;

        if(len >= 11){
            for(int i : num_list){
                sum += i;
            } return sum;
        } else {
            for(int i : num_list){
                multi *= i;
            } return multi;
        }
    }
}