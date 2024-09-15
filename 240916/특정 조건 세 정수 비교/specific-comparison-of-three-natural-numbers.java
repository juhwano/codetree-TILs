import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        
        if (a <= b && a <= c){
            System.out.printf("%d ",1);
        }else{
            System.out.printf("%d ",0);
        }
        if (a == b && a == c){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        sc.close();

        
        
    }
}