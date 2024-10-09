import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[10];
        int cnt=0;

        arr[0] = sc.nextInt();

        for (int i=1; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[0];
        }
        
        for (int j=0; j<arr.length; j++){
            System.out.print(arr[j]+" ");

            if (arr[j]%5==0){
                cnt++;
            }
            if (cnt>=2){
                break;
            }
            
            
        }
    }
}