import java.util.*;

public class Q1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();

            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            // Arrays.sort(arr);
            int flag=0;
            for(int i=1;i<arr.length;i++){
                int d = Math.abs(arr[i-1]-arr[i]);
                if(d!=5 && d!=7){
                    flag=1;
                }
            }
            if(flag==1)
                System.out.println("NO");
            else
                System.out.println("YES");

        }

        sc.close();
    }
}