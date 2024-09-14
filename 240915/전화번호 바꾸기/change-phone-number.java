import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] strs = a.split("-");
        System.out.printf("%s-%s-%s",strs[0],strs[2],strs[1]);
    }
}