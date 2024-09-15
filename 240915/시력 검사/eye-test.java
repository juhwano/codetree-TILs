import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double r = sc.nextDouble();
        if (l >= 1.0 && r >= 1.0){
            System.out.println("High");
        }else if (l >= 0.5 && r >= 0.5){
            System.out.println("Middle");
        }else{
            System.out.println("Low");
        }
        sc.close();
    }
}