class Solution {
    public int solution(int[][] arr) {
        // 이중 for문으로 배열을 돌면서 arr[i][j] != arr[j][i] 확인 - if
        // 값이 하나라도 다르면 return 0, 아니면 1

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i][j] != arr[j][i]){
                    return 0;
                }
            }
        }
        return 1;
    }
}