import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int num1 = Integer.parseInt(arr[0]);
        int num2 = Integer.parseInt(arr[1]);
        
        if(num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        int count = Math.max(0, num2 - num1 - 1);
        System.out.println(count);
        
        for(int i = num1+1; i < num2; i++){
            System.out.print(i + " ");
        }

    }
}
