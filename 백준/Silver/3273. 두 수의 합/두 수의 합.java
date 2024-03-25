import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int input1 = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int input2 = Integer.parseInt(br.readLine());

        // 숫자가 나왔는지 확인
        boolean[] bool = new boolean[2000001];
        // 입력 받은 수열을 배열로 변환
        int[] nums = new int[input1];
        // for문을 돌면서 s 배열 요소를 하나씩 가져와서 string -> int 변환
        for(int i = 0; i < s.length; i++){
            nums[i] = Integer.parseInt(s[i]);
        }
        int count = 0;
        
        // for문을 돌면서 입력받은 배열 요소를 확인
        // -> 그 수가 있는 bool 배열에 T로 바꿈, input2 - 입력받은 배열의 요소를 빼줌
        // input2 - 입력받은 배열의 요소를 빼줌 = bool 배열의 인덱스 = targerNumber
        for(int i = 0; i < nums.length; i++){
            if ((input2- nums[i]) > 0 && bool[input2 - nums[i]]){
                count++;
            }
            bool[nums[i]] = true; // 12를 만들 때 6 나오는 경우 생각하기 
        }

        // 조건을 만족하면 count++
        System.out.println(count);
    }
}