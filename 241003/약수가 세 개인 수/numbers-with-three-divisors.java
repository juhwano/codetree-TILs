import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int startNum = sc.nextInt();
        int endNum = sc.nextInt();
        int result=0;
        for (int i=startNum; i<endNum; i++){
            //약수가 세개인 수
            int cnt = 0;
            for (int j=1; j<i+1; j++){
                if (i%j==0){
                    cnt++;
                }
            }
            if (cnt==3){
                result++;
            }
        }
        System.out.println(result);
    }
}