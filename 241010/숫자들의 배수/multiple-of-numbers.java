import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[10];
        arr[0] = n;
        for (int i=1; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[0];
        }
        int cnt=0;
        for (int j=0; j<arr.length; j++){
            if (cnt>2){
                break;
            }
            System.out.print(arr[j]+" ");
            if (arr[j]%5==0){
                cnt++;
            }
            
        }
    }
}