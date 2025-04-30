class Solution {
    public int solution(int n) {
        // char[] arr = String.valueOf(n).toCharArray();
        
        // int answer = 0;
        // for(int i = 0; i < arr.length; i++){
        //     answer += arr[i] - '0';
        // }
        
        // return answer;

        int answer = 0;
        
        while(n > 0){
            answer += n % 10;
            n /= 10;
        }
        
        return answer;
    }
}
