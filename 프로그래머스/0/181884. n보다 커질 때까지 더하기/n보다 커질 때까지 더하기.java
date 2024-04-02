class Solution {
    public int solution(int[] numbers, int n) {
         // numbers 배열을 for문으로 돌면서 누적 합을 저장하는 변수 sum에 요소를
        // 하나씩 더한다 -> 더할 때마다 if문으로 n보다 큰지 확인 -> 합이 더 클 때 리턴

        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            if(sum <= n) {
                sum += numbers[i];
            }
        }
        return sum;
    }
}