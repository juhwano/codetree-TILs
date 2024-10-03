import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }
        
        int sum=0;
        int idx=0;
        for (int j=0; j<arr.length; j++){
            if (arr[j] >= 250){
                idx = j;
                break;
            }
            idx=arr.length;
            sum += arr[j];
        }
        double avg= (double) sum / idx;
        System.out.printf("%d %.1f", sum,avg);
    }
}