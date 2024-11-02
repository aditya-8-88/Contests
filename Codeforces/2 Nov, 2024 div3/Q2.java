import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[k + 1];

            for (int i = 0; i < k; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr[a] += b;
            }

            Arrays.sort(arr);

            int sum = 0;
            int count = 0;
            for (int i = arr.length - 1; i >= 0 && count < n && arr[i] > 0; i--) {
                sum += arr[i];
                count++;
            }

            System.out.println(sum);
        }

        sc.close();
    }
}
