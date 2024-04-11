class Solution {
    public int solution(int[] num_list, int n) {
        // for each 문으로 num_list를 돌면서 n이 있는지 확인
        for (int i : num_list) {
            if(i == n){
                return 1;
            } 
        }
        return 0;
    }
}