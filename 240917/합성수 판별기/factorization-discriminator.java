import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        boolean cond = false;
        int n = sc.nextInt();
        for (int i =2; i < n; i++){
            if (n % i == 0){
                cond = true;
                break;
            }
        }
        if (cond){
            System.out.print("C");
        }else{
            System.out.print("N");
        }
        sc.close();
    }
}