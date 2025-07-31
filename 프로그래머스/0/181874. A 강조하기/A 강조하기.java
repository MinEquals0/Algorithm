class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'a' || myString.charAt(i) == 'A'){
                sb.append("A");
            } else {
                char c = myString.charAt(i);
                String s = String.valueOf(c);
                sb.append(s.toLowerCase());
            }
        }
        return sb.toString();
    }
}