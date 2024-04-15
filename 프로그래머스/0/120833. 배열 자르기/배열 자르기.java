class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // 메서드 사용 X
        // num1 - num2(포함) 자르기
        // 결과를 저장할 int배열 생성 - 길이 : num2-num1+1
        // for문을 순회 - i 시작 범위 = num1, 끝 범위 = num2
        // 새배열[idx++] = numbers[i] - 인덱스 변수 생성

        int idx = 0;

        int[] answer = new int[num2-num1+1];

        for(int i = num1; i <= num2; i++){
            answer[idx++] = numbers[i];
        }

        return answer;
    }
}