class Solution {
    public int solution(int a, int b) {
        String str1 = "";
        
        str1 += a;
        str1 += b;
        
        String str2 = "";
        
        str2 += b;
        str2 += a;
        
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        
        if(num1 == num2){
            return num1;
        }
        
        return num1 > num2 ? num1 : num2;
    }
}