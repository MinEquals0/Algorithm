import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        int n1 = Integer.parseInt(arr[0]);
        int k1 = Integer.parseInt(arr[1]);
        int n2 = Integer.parseInt(arr[2]);
        int k2 = Integer.parseInt(arr[3]);

        int result = (n1 * k1) + (n2 * k2);

        System.out.println(result);
    }
}
