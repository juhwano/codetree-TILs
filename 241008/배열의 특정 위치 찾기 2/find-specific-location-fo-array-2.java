import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int evenSum = 0;
        int oddSum = 0;
        
        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for (int j=0; j<arr.length; j++){
            if (j%2==0){
                evenSum+=arr[j];
            }else{
                oddSum+=arr[j];
            }

        }
        System.out.println(evenSum > oddSum ? evenSum-oddSum:oddSum-evenSum);

    }
}