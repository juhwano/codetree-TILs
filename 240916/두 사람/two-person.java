import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int aAge = sc.nextInt();
        char aSex = sc.next().charAt(0);

        int bAge = sc.nextInt();
        char bSex = sc.next().charAt(0);

        if ((aAge >= 19 && aSex == 'M') || (bAge >= 19 && bSex == 'M')){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        sc.close();
    }
}