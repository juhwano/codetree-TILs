import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 8 && n > 12){
            System.out.println("Fall");
        }else if(n > 5){
            System.out.println("Summber");
        }else if(n > 2){
            System.out.println("Spring");
        }else{
            System.out.println("Winter");
        }
        sc.close();
    }
}