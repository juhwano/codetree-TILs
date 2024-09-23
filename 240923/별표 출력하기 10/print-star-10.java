import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n*2; i++){
            // 짝수(1,3,5행 ++) 1 2 3 4 5 n+1
            // i = 1,3,5 
            if (i % 2 == 0){ 
                for (int j = 0; j < i/2 + 1; j++){
                    System.out.print("* ");
                }
            // 홀수(2,4,6행 --)
            }else {
                for (int j = 0; j < n-i/2; j++){
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}