class Solution {
    public int solution(String myString, String pat) {
        // myString을 pat의 길이만큼 잘라서 비교
        // bana까지만 for문 돌면서 substring으로 문자열을 자른 후 pat 이랑 비교
        // 두 값이 동일하면 count++ -> count할 변수 생성
        int count = 0;

        int len = myString.length() - pat.length(); 

        for(int i = 0; i <= len; i++){ 
            String str = myString.substring(i, i+pat.length());
            if(str.equals(pat)){
                count++;
            }
        }
        return count;
    }
}