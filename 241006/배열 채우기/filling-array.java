import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int idx = 0;
        for (int i=0; i<10; i++){
            int n = sc.nextInt();
            if (n == 0 ){
                idx = i;
                break;
            }else{
                idx = 10;
                arr[i] = n;
            }
        }
        for (int j=idx-1; j>-1; j--){
            System.out.print(arr[j] +" ");
        }

    }
}