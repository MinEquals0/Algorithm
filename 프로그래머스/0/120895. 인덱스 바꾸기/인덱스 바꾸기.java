class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] arr = new char[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++){
            if(i == num1 || i == num2 ){
                arr[num2] = my_string.charAt(num1);
                arr[num1] = my_string.charAt(num2);
                
            } else {
                arr[i] = my_string.charAt(i);
                
            }
        }
        String str = String.valueOf(arr);
        
        return str;
    }
}