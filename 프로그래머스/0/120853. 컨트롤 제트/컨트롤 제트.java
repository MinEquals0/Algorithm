class Solution {
    public int solution(String s) {
        // 문자열에 있는 공백을 기준으로 split -> String[] 저장
        // 문자열 배열을 for문으로 돌면서 각 요소를 char로 변환
        // 누적합 변수에 더하기 - 변수 생성
        // 요소가 문자 Z면 누적합에서 마지막에 더해준 숫자를 빼기
        // 누적합 -= ch[Z의 인덱스 -1]
        // 나머지 경우는 누적합에 숫자를 더해줌
        // 누적합 리턴

        int sum = 0;
        String[] strArr = s.split(" ");

        for(int i = 0; i < strArr.length; i++){
            if(strArr[i].equals("Z")){ // Z인지 확인
                sum -= Integer.parseInt(strArr[i-1]);
            } else {
                sum += Integer.parseInt(strArr[i]);
            }
        }
        return sum;
    }
}