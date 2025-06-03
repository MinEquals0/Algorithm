import java.util.*;

class Solution {
    public String solution(String polynomial) {
        // 문자열을 split으로 + 기준으로 나누기
        // 문자열을 순회하면서 x가 있는 요소와 없는 요소끼리 더해줌
        String[] arr = polynomial.split("\\+");
        
        int xSum = 0;  // x항들의 누적합
        int numSum = 0;  // 일반 항들의 누적합
        
        for(String str : arr){
            str = str.trim(); // 공백 제거
            if(str.contains("x")){
                String s = str.replace("x","").trim(); // 공백 제거
                if(s.equals("")){ // 1x 값 처리
                    s = "1";
                }
                xSum += Integer.parseInt(s.trim()); // 누적합 구하기
            } else {
                numSum += Integer.parseInt(str.trim());
            }
           
        }
        // 결과값 출력
        /* if문 이용
        if(xSum == 0){ // x항이 없을 때
            return String.valueOf(numSum);
        } else if (numSum == 0){ // 숫자항이 없을 때
            return xSum == 1 ? "x" : xSum + "x";
        } else {
            return (xSum == 1 ? "x" : xSum + "x") + " + " + numSum;
        } */

        // StringBuilder를 이용
        StringBuilder sb = new StringBuilder();
        
        if(xSum != 0){
            if(xSum == 1){
                sb.append("x");
            } else {
                sb.append(xSum).append("x");
            }
        }
        
        if(numSum != 0){
            if(xSum != 0){
                sb.append(" + ");
            } 
            sb.append(numSum);
        }
        
        return sb.toString();
    }
}
