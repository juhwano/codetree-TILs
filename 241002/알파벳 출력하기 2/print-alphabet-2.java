import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int asc = 65;
        for (int i=n; i>0; i--){
            for (int j=n; j>0; j--){
                if (i<j){
                    System.out.print("  ");
                }else{
                    System.out.print((char)asc +" ");
                    asc++;
                    if (asc==91){
                        asc=65;
                    }
                }
            }
            System.out.println();
        }

    }
}