class Solution {
    public int solution(int[] array) {
        int[] cntArr = new int[1000];
        
        // 빈도수 세기
        for(int i : array){
            cntArr[i]++;
        }
        
        int max = 0;
        
        // 최대 빈도수 찾기
        for(int i : cntArr){
            if(max < i){
                max = i;
            }
        } 
        
        // 최빈값 구하기
        int maxCnt = 0;
        int answer  = 0;          
        for (int i = 0; i < cntArr.length; i++) {
            if (cntArr[i] == max) {
                maxCnt++;
                answer = i;      
            }
        }
        
        return (maxCnt > 1) ? -1 : answer;
        
    }
}