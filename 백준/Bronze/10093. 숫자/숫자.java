import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long num1 = Long.parseLong(st.nextToken());
        long num2 = Long.parseLong(st.nextToken());
        
        if(num1 > num2){
            long temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        long count = Math.max(0, num2 - num1 - 1);
        System.out.println(count);
        
        for(long i = num1+1; i < num2; i++){
            if (i != num1 + 1) System.out.print(" ");
            System.out.print(i);
        }

    }
}

// 입력 범위가 보통 |A|, |B| ≤ 10^18
// int는 최대 약 21억(2.1×10⁹)
// 큰 수 들어오면 오버플로우 나서 일부 테스트만 통과
// int -> long 바꿔줌

