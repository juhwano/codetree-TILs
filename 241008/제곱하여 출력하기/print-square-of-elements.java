import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int j=0; j<arr.length; j++){
            arr[j] = (int)Math.pow(arr[j], 2);
            System.out.print(arr[j]+" ");
        }
    }
}