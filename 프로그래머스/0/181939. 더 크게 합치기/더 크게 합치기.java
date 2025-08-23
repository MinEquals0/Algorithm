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

        // refactoring
        // int num1 = a * (int)Math.pow(10, String.valueOf(b).length()) + b;
        // int num2 = b * (int)Math.pow(10, String.valueOf(a).length()) + a;
        
        // if(num1 == num2){
        //     return num1;
        // }
        
        // return Math.max(num1, num2);
    }
}
