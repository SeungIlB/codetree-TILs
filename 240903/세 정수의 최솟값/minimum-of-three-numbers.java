import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner를 사용하여 입력을 받습니다.
        Scanner sc = new Scanner(System.in);
        
        // 세 개의 정수를 입력 받습니다.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // 세 정수 중 가장 작은 값을 찾습니다.
        if (a <= b && a <= c) {
            System.out.println(a);
        } else if (b <= a && b <= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}