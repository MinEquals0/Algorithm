class Solution {
    public int solution(String str1, String str2) {
        // substring 이용. str1길이만큼 문자열 잘라서 str2와 비교
        // 함수에 사용될 인덱스를 다르게 설정 -> for 문
      
  
        for(int i = 0; i <= str2.length()-str1.length(); i++){

            String s = str2.substring(i, i+str1.length());
            
            if(str1.equals(s)){
                return 1;
            } 
        }
        
        return 0;
        
    }
}
