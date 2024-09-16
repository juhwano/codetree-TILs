import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int imergence =0;
        Scanner sc = new Scanner(System.in);
        char isColdA = sc.next().charAt(0);
        int tempA = sc.nextInt();

        char isColdB = sc.next().charAt(0);
        int tempB = sc.nextInt();

        char isColdC = sc.next().charAt(0);
        int tempC = sc.nextInt();

        if (isColdA == 'Y' && tempA >= 37){
            imergence += 1;
        }
        if (isColdB == 'Y' && tempB >= 37){
            imergence += 1;
        }
        if (isColdC == 'Y' && tempC >= 37){
            imergence += 1;
        }
        if (imergence >= 2){
            System.out.println("E");
        }else{
            System.out.println("N");
        }
        sc.close();

    }
}