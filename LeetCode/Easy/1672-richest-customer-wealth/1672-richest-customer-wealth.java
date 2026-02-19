class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for(int i = 0; i < accounts.length; i++){
            int sum = 0;

            for(int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }

            max = Math.max(max, sum);
        }

        return max;


        // 2. 더 짧은 시간
        int highestWealth = 0;

        for(int i = 0; i < accounts.length; i++){
            int customerWealth = 0;

            for(int j = 0; j < accounts[i].length; j++){
                customerWealth += accounts[i][j];
            }

            if(customerWealth > highestWealth) {
                highestWealth = customerWealth;
            }
        }

        return highestWealth;
    }
}
