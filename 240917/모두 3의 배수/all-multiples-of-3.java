import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        boolean cond = true;
        for (int i = 1; i<=5; i++){
            int num = sc.nextInt();
            if (num % 3 != 0){
                cond =false;
                break;
            }
        }
        if (cond){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        sc.close();
    }
}