class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] newArr = new int[num_list.length];
        // for문을 돌면서 앞 - n ~ 끝까지 자르고(인덱스)
        // 뒤 - 0~n-1까지
        int idx = 0;

        for(int i = n; i < num_list.length; i++){
            newArr[idx] = num_list[i];
            idx++;
        }

        for(int i = 0; i <= n-1; i++){
            newArr[idx] = num_list[i];
            idx++;
        }
        return newArr;
    }
}