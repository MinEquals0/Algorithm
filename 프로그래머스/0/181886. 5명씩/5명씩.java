import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> list = new ArrayList<>();
        
        
        for(int i = 0; i < names.length; i += 5){
            list.add(names[i]);
        }
        
        return list.toArray(new String[0]);
    }
}