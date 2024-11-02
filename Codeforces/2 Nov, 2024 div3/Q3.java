import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int q = sc.nextInt(); 
            StringBuilder sb = new StringBuilder(s);
            
            while (q-- > 0) {
                int idx = sc.nextInt() - 1;
                char ch = (char) (sc.nextInt() + '0'); 

                if (sb.charAt(idx) != ch) {
                    sb.setCharAt(idx, ch); 
                }

                boolean has1100 = checkFor1100(sb);
                System.out.println(has1100 ? "YES" : "NO");
            }
        }
        sc.close();
    }

    private static boolean checkFor1100(StringBuilder sb) {
        for (int i = 0; i <= sb.length() - 4; i++) {
            if (sb.substring(i, i + 4).equals("1100")) {
                return true; 
            }
        }
        return false;
    }
}


// time limit exceeded as the search for 1100 is not optimized
