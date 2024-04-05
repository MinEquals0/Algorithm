class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[a-c]", " ");
        String[] result = myStr.trim().split(" +");

        if(result[0].isEmpty()){
            return new String[]{"EMPTY"};
        } else {
            return result;
        }
    }
}