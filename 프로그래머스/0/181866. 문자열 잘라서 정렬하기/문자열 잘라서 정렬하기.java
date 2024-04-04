import java.util.*;

class Solution {
    public String[] solution(String myString) {
        ArrayList<String> list = new ArrayList<>();
        
        String[] str = myString.split("x+");
        Arrays.sort(str);
        
        for(int i = 0; i < str.length; i++){
            if(!str[i].isEmpty()){
                list.add(str[i]);
            }
        }
        return list.toArray(new String[]{});
    }
}