import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int studentNum = sc.nextInt();
        int cnt =0;
        for (int i=0; i<studentNum.length; i++){
            int[] scores = new int[4];
            int sum=0;
            
            for (int j=0; j<4; j++){
                scores[i] = sc.nextInt();
                sum += scores[i];
            }
            double avg = (double)sum / 4;
            if (avg >= 60){
                System.out.println("pass");
                cnt++;
            }else{
                System.out.println("fail");
            }
        }
        System.out.println(cnt);
        

    }
}