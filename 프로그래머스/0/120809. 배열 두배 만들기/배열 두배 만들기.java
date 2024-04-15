class Solution {
    public int[] solution(int[] numbers) {
        // for문으로 배열을 돌면서 기존 요소에 * 2한 값을 다시 할당

        for(int i = 0; i < numbers.length; i++){
            numbers[i] *= 2;
        }
        return numbers;
    }
}