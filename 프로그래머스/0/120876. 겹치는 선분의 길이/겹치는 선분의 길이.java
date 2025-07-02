class Solution {
    public int solution(int[][] lines) {
       // 좌표설정
        int[] arr = new int[201];
        
        // 좌표 표시
        for(int[] line : lines){
            int start = line[0];
            int end = line[1];
            for(int i = start; i < end; i++){
                arr[i + 100]++;
            }
        }
        
        // 겹치는 칸 
        int answer = 0;
        
        for(int i : arr){
            if(i >= 2) {
                answer ++;
            }
        }
        
        return answer;
    }
}