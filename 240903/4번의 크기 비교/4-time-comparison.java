import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int result = 0;

        result = a > b ? 1 : 0;
        System.out.println(result);
        result = a > c ? 1 : 0;
        System.out.println(result);
        result = a > d ? 1 : 0;
        System.out.println(result);
        result = a > e ? 1 : 0;
        System.out.println(result);

    }
}