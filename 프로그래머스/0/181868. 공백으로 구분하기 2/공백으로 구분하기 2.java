
import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] arr = my_string.split(" ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        
        for(int i = list.size() -1 ; i >= 0; i--){
            if(list.get(i).equals("")){
                list.remove(i);
            }
        }
        
        String[] answer = list.toArray(new String[0]);
        
        return answer;
    }
}