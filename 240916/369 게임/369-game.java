import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n){
            if (i % 3 == 0){
                System.out.print("0 ");
            }else if(i % 10 == 3){
                System.out.print("0 ");
            }else if(i % 10 == 6){
                System.out.print("0 ");
            }else if(i % 10 == 9){
                System.out.print("0 ");
            }else{
                System.out.print(i + " ");
            }
            i++;
        }
        sc.close();
    }
}