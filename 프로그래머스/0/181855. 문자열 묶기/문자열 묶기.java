class Solution {
    public int solution(String[] strArr) {
        // strArr원소의 최대 길이가 30이므로 길이가 30인 새 배열 생성
        // 이 배열안에서 strArr 요소들의 문자열길이에 따라 카운팅되도록 함
        // strArr배열을 for문으로 돌면서 각 요소들을 카운트
        // for문으로 카운트한 배열을 돌면서 최대값 구하는 방식 - max 변수 생성

        int[] countArr = new int[31];
        int max = 0;

        for(int i = 0; i < strArr.length; i++){
            countArr[strArr[i].length()]++;
        }

        for(int i = 0; i < countArr.length; i++){
            if(max < countArr[i]){
                max = countArr[i];
            }
        }
        return max;
    }
}