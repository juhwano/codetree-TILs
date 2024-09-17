import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            // 0 2 4 6 8 공백 2+i+1
            // 9 7 5 3 1 별
            
            for (int j=0; j<=2*i-2; j++){
                System.out.print(" ");
            }
            for (int k=-2*i+11; k>0; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}