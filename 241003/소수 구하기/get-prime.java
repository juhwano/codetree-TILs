import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i=2; i<=n; i++){
            // 약수가 1과 자기 자신
            int cnt=0;
            for (int j=1; j<=i; j++){
                if (i%j==0){
                    cnt++;
                }
                if (j==i && cnt==2){
                    System.out.print(i +" ");
                }
            }

        }
    }
}