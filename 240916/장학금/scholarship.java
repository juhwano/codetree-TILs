import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int mid = sc.nextInt();
        int end = sc.nextInt();
        
        if (mid >= 90){
            if (end >= 95){
                System.out.println("100000");
            }else if(end >= 90){
                System.out.println("50000");
            }else{
                System.out.println("0");
            }
        }else{
            System.out.println("0");
        }
        sc.close();
    }
}