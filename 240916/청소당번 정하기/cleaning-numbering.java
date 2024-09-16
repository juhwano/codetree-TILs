import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=0,c=0;
        for (int i = 1; i<=n; i++){
            if (i % 2 == 0) a++;
            if (i % 3 == 0) b++;
            if (i % 2 == 0 && i % 3 == 0){
                a--;
            }
            if (i % 12 == 0) {
                c++;
                a--;
                b--;
            }
        }
        System.out.printf("%d %d %d",a,b,c);
    }
}