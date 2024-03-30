class Solution {
    public int solution(int[] num_list) {
        // num_list를 for으로 돌면서 각 요소가 0보다 작은 경우 인덱스를 리턴
        // 없는 경우 -1

        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] < 0) {
                return i;
            }
        } 
        return -1;
    }
}