import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double avg;
        int sumVal=0, cnt=0;
        
        for (int i = 1; i<=n; i++){
            int num = sc.nextInt();
            sumVal+=num;
            cnt++;
        }
        avg = (double)sumVal/cnt;
        System.out.printf("%d %.1f", sumVal, avg);
        sc.close();
    }
}