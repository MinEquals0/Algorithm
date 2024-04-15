class Solution {
    public int[] solution(String[] strlist) {
        // for문을 순회하면서 각 요소의 길이를 저장
        // 결과값을 담을 int 배열 생성 - 길이 : strlist.length

        int[] answer = new int[strlist.length];

        for(int i = 0; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }
}