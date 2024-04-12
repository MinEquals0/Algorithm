class Solution {
    public int solution(String[] order) {
                int total = 0;

        for(int i = 0; i < order.length; i++){
            if(order[i].contains("cafelatte")){
                total += 5000;
            } else {
                total += 4500;
            }
        }
        return total;
    }
}