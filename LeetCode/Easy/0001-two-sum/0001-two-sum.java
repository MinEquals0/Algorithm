class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 1.
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


        // 2. 
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(mp.containsKey(target - nums[i])){
                return new int[]{mp.get(target-nums[i]), i};
            }
            mp.put(nums[i], i);
        }
        return new int[]{};

    }
}
