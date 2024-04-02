class Solution {
    public int solution(int[] num_list) {
        // 인덱스 0 = 첫번째 요소
        // 홀수 인덱스 합, 짝수 인덱스 합 중 큰 값을 리턴
        // for문을 돌면서 if문으로 인덱스가 홀/짝인지 판별
        // 각각 합을 구해줌 -> 두 값을 비교
        int evenSum = 0;
        int oddSum = 0;

        for(int i = 0; i < num_list.length; i++){
            if((i+1) % 2 == 0){
                evenSum += num_list[i];
            } else {
                oddSum += num_list[i];
            }
        }
        return evenSum > oddSum ? evenSum : oddSum;
    }
}