import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        double cnt = 0;
        int sumVal=0;
        for (int i =a; i<=b; i++){
            if (i % 5 == 0 || i % 7 == 0) {
                sumVal+=i;
                cnt++;
            };
        }
        System.out.printf("%d %.1f", sumVal, sumVal/cnt);
    }
}