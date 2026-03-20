class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;

        int[] answer = new int[2];

        for(int i = 0; i < nums.length; i++){
            sum = 0;
            for(int j = i+1; j < nums.length; j++) {
                sum = nums[i] + nums[j];

                if (sum == target) {
                    answer[0] = i;
                    answer[1] = j;
                    System.out.println(answer[0]);
                    System.out.println(answer[1]);
                    return answer;
                }
            }
        }
        return answer;

    }
}