class Solution {
    public int solution(String[] spell, String[] dic) {
        
        int answer = 0;
        
        for(int i = 0; i < dic.length; i++){
            int cnt = 0;
            for(int j = 0; j < spell.length; j++){
                if(dic[i].contains(spell[j])){
                    cnt++;
                }
                if(cnt == spell.length){
                    answer++;
                }
            }
        }
        return answer != 0 ? 1 : 2;
    }
}