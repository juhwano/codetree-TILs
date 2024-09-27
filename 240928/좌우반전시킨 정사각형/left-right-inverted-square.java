import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=i*n-i; j>=0; j-=i){
                System.out.print((i+j) +" ");
            }
            System.out.println();
        }

    }
}