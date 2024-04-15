class Solution {
    public int[][] solution(int[] num_list, int n) {
        // 결과를 저장할 배열 생성 - 열 : n, 행 : num_list.length/n
        // 이중 for문을 돌면서 num_list의 요소를 이차원 배열에 저장

        int[][] answer = new int[num_list.length/n][n];
        int idx = 0;

        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < answer[0].length; j++){
                answer[i][j] = num_list[idx++];
            }
        }
        return answer;
    }
}