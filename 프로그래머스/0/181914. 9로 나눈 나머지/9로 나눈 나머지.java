class Solution {
    public int solution(String number) {
        
        int sum = 0;
        
        for(int i = 0; i < number.length(); i++){
            int num = Character.getNumericValue(number.charAt(i));
            sum += num;            
        }
        
        int answer = sum % 9;
        

        return answer;
    }
}