import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // * 묶음
        for (int i =n; i>=1; i--){
            // 묶음 i번 출력
            for (int j=1; j<=i; j++){

                for (int k=1; k<=i; k++){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}