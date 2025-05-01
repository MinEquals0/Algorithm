import java.util.*;

class Solution {
    public String solution(String my_string) {
        // HashSet<Character> visited = new HashSet<>();
        
        // StringBuilder sb = new StringBuilder();
        
        // for(int i = 0; i < my_string.length(); i++){
        //     char c = my_string.charAt(i);
        //     if(!visited.contains(c)){
        //         sb.append(c);
        //         visited.add(c);
        //     } 
        // }
        
        // return sb.toString();

        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));

        return String.join("", set);
    }
}
