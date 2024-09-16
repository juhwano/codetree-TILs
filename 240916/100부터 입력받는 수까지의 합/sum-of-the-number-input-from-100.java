import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result= (100-n+1)*(n+100) / 2;
        
        System.out.print(result);
    }
}