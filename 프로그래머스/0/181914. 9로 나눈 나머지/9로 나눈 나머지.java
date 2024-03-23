class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        for(int i = 0; i < number.length(); i++){
            char ch = number.charAt(i);
            int n = Character.getNumericValue(ch);
            sum += n;
            answer = sum % 9;
        }
        
        return answer;
    }
}