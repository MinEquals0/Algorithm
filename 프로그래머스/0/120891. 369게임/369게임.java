class Solution {
    public int solution(int order) {
        int answer = 0;
        char[] arr = String.valueOf(order).toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] - '0' == 3 || arr[i] - '0' == 6 || arr[i] - '0' == 9){
                answer ++;
            }
        }
        return answer;
    }
}