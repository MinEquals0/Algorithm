class Solution {
    public int solution(int i, int j, int k) {
        // 숫자들을 문자로 변환한다음, for문 돌면서 비교
        // String s = k + "";
        // int answer = 0;
        
        // for(int a = i; a <= j; a++){
        //     String str = a + "";
        //     for(char c : str.toCharArray()){
        //         if((c + "").equals(s)){
        //             answer++;
        //         }
        //     }
        // }
        // return answer;
        
        String str = "";
        for(int a = i; a <= j; a++){
            str += a + "";
        }
        
        return str.length() - (str.replace(k+"", "")).length();
    }
}
