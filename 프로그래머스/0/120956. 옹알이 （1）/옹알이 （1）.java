class Solution {
    public int solution(String[] babbling) {
        // replace " " 이용해서 조합이 되는 단어만 가진 애는 알파벳 없앰
        // 알파벳 없는 값만 세기
        
        String[] words = {"aya", "ye", "woo", "ma"};
        int cnt = 0;
        
        // 주어진 단어를 가진 문자열을 " " 로 바꿈
        for(int i = 0; i < babbling.length; i++){
            String str = babbling[i];
            for(String word : words){
                str = str.replace(word, " ");
            }
            
             // 알파벳이 없는 단어만 세기
            if(!str.matches(".*[a-zA-Z].*")){
                cnt++;
            }
        
        }
        
        return cnt;
    }
}
