import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double sum = 0.0;
        for (int i =0; i<arr.length; i++){
            arr[i] = sc.nextDouble();
            sum+=arr[i];
        }
        double avg = sum / arr.length;
        System.out.printf("%.1f\n", avg);
        String result = avg >= 4.0 ? "Perfect" : avg >= 3.0 ? "Good":"Poor";
        System.out.println(result);
    }
}