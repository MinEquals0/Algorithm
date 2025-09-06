class Solution {
    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        
        for(int i : num_list){
            if(i % 2 == 0){
                even.append(i);
            } else {
                odd.append(i);
            }
        }
        
        int e = Integer.parseInt(even.toString());
        int o = Integer.parseInt(odd.toString());
        
        return e + o;
    }
}