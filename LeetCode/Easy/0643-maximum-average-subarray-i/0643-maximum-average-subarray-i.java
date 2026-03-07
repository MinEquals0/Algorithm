class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        // 1. 첫번째 윈도우 설정    
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        int maxSum = sum;

        // 2. 슬라이딩 윈도우 설정
        for(int i = k; i < nums.length; i++){
            // 기존의 합에서 첫번째 수를 빼줌
            sum -= nums[i - k];
            // 기존의 합에 새로운 수를 더함
            sum += nums[i];

            maxSum = Math.max(maxSum, sum);
        }

        return (double)maxSum / k;
    }
}