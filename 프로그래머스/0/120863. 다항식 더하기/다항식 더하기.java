import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split("\\+");
        
        int xSum = 0;
        int numSum = 0;
        
        for(String str : arr){
            str = str.trim();
            if(str.contains("x")){
                String s = str.replace("x","").trim();
                if(s.equals("")){ // 1x 값 처리
                    s = "1";
                }
                xSum += Integer.parseInt(s.trim());
            } else {
                numSum += Integer.parseInt(str.trim());
            }
           
        }
        
        if(xSum == 0){
            return String.valueOf(numSum);
        } else if (numSum == 0){
            return xSum == 1 ? "x" : xSum + "x";
        } else {
            return (xSum == 1 ? "x" : xSum + "x") + " + " + numSum;
        }
    }
}