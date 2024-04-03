class Solution {
    public String[] solution(String[] strArr) {
        // 홀수인덱스 - 대문자, 짝 - 소
        // for문 돌면서 if문으로 분기

        for(int i = 0; i < strArr.length; i++){
            if(i % 2 == 0){
                strArr[i] = strArr[i].toLowerCase();
            } else {
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        return strArr;
    }
}