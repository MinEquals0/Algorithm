class Solution {
    public int solution(int a, int b) {
        String s = "";
        s += a;
        s += b;
        //  String s = String.valueOf(a) + b;
        
        int sNum = Integer.parseInt(s);
        
        int num = 2 * a * b;
        
        if(sNum == num) {
            return sNum;
        }
        
        return sNum > num ? sNum : num;
    }
}
