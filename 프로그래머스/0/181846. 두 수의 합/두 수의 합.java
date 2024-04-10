import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger aBig = new BigInteger(a);
        BigInteger bBig = new BigInteger(b);
        return aBig.add(bBig).toString();
    }
}