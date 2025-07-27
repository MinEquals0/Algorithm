class Solution {
    public int solution(String number) {
        
        int sum = 0;
        
        for(int i = 0; i < number.length(); i++){
            int num = Character.getNumericValue(number.charAt(i));
            sum += num;            
        }
        
        int answer = sum % 9;

        // 오버 플로우
        // try {
        //     int num = Integer.parseInt(number); // 여기서 예외 발생
        //     System.out.println("변환된 숫자: " + num);
        // } catch (NumberFormatException e) {
        //     System.out.println("오버플로우 발생! int 범위 초과: " + number);
        // }

        return answer;
    }
}
