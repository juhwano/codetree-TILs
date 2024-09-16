import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        // 윤년 조건 (4로 나누어 떨어짐, 100으로 나누어 떨어지지 않고 400으로 나누어 떨어지는 해)
        int y = sc.nextInt();
        if ((y % 4 == 0) || (y % 100 != 0 && y % 400 == 0)){
            System.out.println("true");
        }else{ 
            System.out.println("false");
        }
        sc.close();
    }
}