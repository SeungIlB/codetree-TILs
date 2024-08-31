import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = 0;
        temp = a;
        a = b;
        b = temp;

        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
    }
}