import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == Character.toUpperCase(ch)){
                ch = Character.toLowerCase(ch);
            } else {
                ch = Character.toUpperCase(ch);
            } 
            sb.append(ch);
        }
        
        
        System.out.println(sb.toString());
        sc.close();
    }
}