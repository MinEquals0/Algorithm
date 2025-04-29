class Solution {
    public int[] solution(int[] numbers, String direction) {
        // left - 첫자리 수가 끝으로 이동, 전체 인덱스 -1
        // 만약 인덱스가 0보다 작아지면, 인덱스 length-1, 나머지는 전체 -1 
        // right - 끝의 자리 수가 첫자리로 이동, 전체 인덱스 +1
        // right일 때, 만약에 인덱스가 배열의 길이-1보다 길어지면, 인덱스 0, 나머지는 +1

        int len = numbers.length;
        int[] answer = new int[len];
        
        if(direction.equals("left")) {
            answer[0] = numbers[1];
            answer[len-1] = numbers[0];
           for(int i = 1; i < len-1; i++){
               answer[i] = numbers[i+1];
           } 
        } else{
            answer[0] = numbers[len-1];
            for(int i = 1; i < len; i++){
                answer[i] = numbers[i-1];
            }
        }
        return answer;
    }
}
