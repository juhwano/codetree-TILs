import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);
        int m = sc.nextInt();
        int cnt =0;
        for (int i=0; i<m; i++){
            int n = sc.nextInt();
            while (n!=1){
                if (n%2==0){
                    n /= 2;
                }else{
                    n = 3*n+1;
                }
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}