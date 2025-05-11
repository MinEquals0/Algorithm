import java.util.*;

class Solution {
    public String solution(String bin1, String bin2) {
        // bin1, bin2를 이진수로 해석하여 십진수로 변환
        // 두 값을 더함
        // 그 합을 다시 이진수로 변환하여 결과를 반환
        
        // int a = Integer.parseInt(bin1, 2);
        // int b = Integer.parseInt(bin2, 2);

        // return Integer.toBinaryString(a+b);


        
        // 길이 맞추기
        while(bin1.length() < bin2.length()){
            bin1 = "0" + bin1;
        }
        
        while(bin1.length() > bin2.length()){
            bin2 = "0" + bin2;
        }
        
        
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i = bin1.length()-1; i >= 0; i--){
            int b1 = bin1.charAt(i) - '0';
            int b2 = bin2.charAt(i) - '0';
            
            int sum = b1 + b2 + carry;
            sb.append(sum % 2);
            carry = sum / 2;
        }
        
        if(carry == 1){
            sb.append(carry);
        }
        
        sb.reverse();
        
        return sb.toString();
    }
}
