class Solution {
    public int[][] solution(int n) {
        // 이중 for문으로 배열을 만듦
        // 두번째 for문 안에 if문으로 i,j 같은 경우 - 1
        // 다른 경우 - 0 이 들어가게 만듦

        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
}