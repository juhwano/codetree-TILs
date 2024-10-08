import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int k=0;
        for (int j=0; j<arr.length; j++){
            if (arr[j]%3==0){
                k=j;
                break;
            }
        }
        System.out.print(arr[k-1]);
    }
}