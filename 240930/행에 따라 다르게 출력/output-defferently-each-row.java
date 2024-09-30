import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        // 행 짝수+1, 홀수+2
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int cnt =1;
        for (int i=0; i<n; i++){
            if (i % 2== 0){
                for (int j=0; j<n; j++){
                    System.out.print(i * n +cnt+" ");
                    cnt++;
                }
            }else{
                for (int j=0; j<n; j++){
                    System.out.print(2*n-1 + 2*j + " ");
                }
            }
            System.out.println();
        }
    }
}