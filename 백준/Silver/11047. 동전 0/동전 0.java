import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr = br.readLine().split(" ");
        
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        
        int[] coins = new int[n];
        
        for(int i = 0; i < n; i++){
            coins[i] = Integer.parseInt(br.readLine());
        }
        
        // k보다 큰 동전은 제외
        // 남은 동전 중에서 가장 큰 단위의 동전을 최대한 사용
        // 남은 k 값에 가까운 동전 최대한 사용
        // for문 coins 배열을 돌면서, k보다 큰 애들은 넘어가기
        // 동전이 오름차순으로 주어지니까 배열을 끝부터 돌기
        // 코인의 개수를 계산할 변수 생성, 동전의 누적 합
        int coinCount = 0;
        
        for(int i = coins.length-1; i >= 0; i--){ // 인덱스는 배열의 길이보다 1이 작음
            if(coins[i] > k){
                continue;
            } else {
                coinCount += k / coins[i]; // 4000 - 200
                k = k % coins[i]; // 4200을 1000으로 나눈 나머지를 k로 두기
                if(k == 0) {
                    break;
                }
            }
        }
        System.out.println(coinCount);
    }
}
