class Solution {
    public int solution(int n) {
        int product = 1;
        int i = 1;
        
        while(product * (i + 1) <= n){
            i++;
            product *= i;
        }
         return i;
        
    }
}