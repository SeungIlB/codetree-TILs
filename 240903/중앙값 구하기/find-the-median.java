import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력 받기
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // 중앙값 구하기
        if ((a > b && a < c) || (a > c && a < b)) {
            System.out.println(a);
        } else if ((b > a && b < c) || (b > c && b < a)) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}