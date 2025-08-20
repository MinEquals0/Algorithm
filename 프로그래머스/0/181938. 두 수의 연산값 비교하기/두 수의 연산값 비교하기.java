class Solution {
    public int solution(int a, int b) {
        String s = "";
        s += a;
        s += b;
        int sNum = Integer.parseInt(s);
        
        int num = 2 * a * b;
        
        if(sNum == num) {
            return sNum;
        }
        
        return sNum > num ? sNum : num;
    }
}