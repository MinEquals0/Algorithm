class Solution {
    public int solution(int[][] board, int k) {
        // 이중 for문을 사용해서 배열을 돌기
        // if문 i+j <= k 보다 작은 경우일 때 요소를 누적합
        // 누적합 변수 생성

        int sum = 0;

        for (int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(i + j <= k){
                    sum += board[i][j];
                }
            }
        }
        return sum;
    }
}