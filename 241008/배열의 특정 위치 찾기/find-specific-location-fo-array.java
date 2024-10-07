import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }
        int two_sum = 0;
        int three_sum = 0;
        int three_cnt = 0;
        for (int j=1; j<arr.length; j+=2){
            two_sum += arr[j];
        }
        for (int k=2; k<arr.length; k+=3){
            three_sum += arr[k];
            three_cnt++;
        }
        double three_sum_avg = (double) three_sum / three_cnt;
        System.out.printf("%d %.1f", two_sum, three_sum_avg);
    }
}