class Solution {
    public boolean isPalindrome(int x) {
        // 숫자를 문자열로 바꿔서 뒤집기
        String str = String.valueOf(x);
        String reversed  = new StringBuilder(str).reverse().toString();

        return reversed.equals(str);
    }
}