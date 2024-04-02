class Solution {
    public int solution(int[] num_list) {
        // 정수 -> 짝 : /2, 홀 : -1 /2 => 1
        // 배열 각 요소의 연산 횟수의 합
        int sum = 0;

        for(int i = 0; i < num_list.length; i++){
            while(num_list[i] > 1) {
                sum++; // while 문에 들어오고 sum 을 증가시키고 홀,짝 코드 실행
                if (num_list[i] % 2 == 0) {
                    num_list[i] /= 2;
                } else {
                    num_list[i] = (num_list[i] - 1) / 2;
                }
            }
        }
        return sum;
    }
}