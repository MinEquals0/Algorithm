class Solution {
    public int[] solution(int[] arr, int[][] queries) {
       // 각 쿼리에 요소 하나당 arr 인덱스 0~끝까지를 전부 대입해서
        // s <= i <= e 찾기 -> arr[i] + 1
        // queries를 for문 - 3행, 2열
        
        for(int i = 0; i < queries.length; i++){ // 행수
            int s = queries[i][0];
            int e = queries[i][1];

            for(int j = s; j <= e; j++){
                arr[j]++;
            }
        }
        return arr;
    }
}