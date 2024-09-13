public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 5, b = 6, c = 7;
        int tempA, tempB;
        tempB = b;
        b = a;
        tempA = a;
        a = c;
        c = tempB;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}