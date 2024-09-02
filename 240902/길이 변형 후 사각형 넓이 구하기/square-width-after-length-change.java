import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int h = sc.nextInt();

        l = l + 8;
        h = h * 3;
        System.out.println(l);
        System.out.println(h);
        System.out.println(h*l);
    }
}