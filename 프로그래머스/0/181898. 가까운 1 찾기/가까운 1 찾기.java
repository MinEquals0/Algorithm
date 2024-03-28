class Solution {
    public int solution(int[] arr, int idx) {
        // idx 포함해서 1이 등장하는 가장 인덱스
         // 젤 먼저 찾는 1이 가장 인덱스를 가짐
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }
        return -1;
    }
}