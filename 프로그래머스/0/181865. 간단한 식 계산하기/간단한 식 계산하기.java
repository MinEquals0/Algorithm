class Solution {
    public int solution(String binomial) {
        String[] str = binomial.split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[2]);
        String s = str[1];

        if(s.equals("+")){
            return a + b;
        } else if(s.equals("-")){
            return a - b;
        } else {
            return a * b;
        }
    }
}