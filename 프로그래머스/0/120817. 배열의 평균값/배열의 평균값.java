class Solution {
    public double solution(int[] numbers) {
        // for문으로 배열을 돌면서 누적합 구함 - 누적합 저장할 double 변수 생성
        // 누적합/numbers.length

        double sum = 0.0;

        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}