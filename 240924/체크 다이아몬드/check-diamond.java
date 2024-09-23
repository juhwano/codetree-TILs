import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < 2*n-1; i++){
            if (i <n){
            // 상단
                for (int j=n-1-i; j>0; j--){
                    System.out.print(" ");
                }
                for (int j=0; j<i+1; j++){
                    System.out.print("* ");
                }
            }else{
            //하단
                for (int k=0; k<i-n+1; k++){
                    System.out.print(" ");
                }
                for (int k=n+4-i; k>0; k--){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}