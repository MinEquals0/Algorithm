import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> set = new HashSet<>();
        Arrays.stream(phone_book).forEach(s -> set.add(s));

        for(String str : set){
            for(int i = 1; i < str.length(); i++){
                if(set.contains(str.substring(0, i))){
                    return false;
                }
            }
        }

        return true;
    }
}
  