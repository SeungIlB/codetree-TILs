import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 정수 a와 b 입력받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // a 이상 b 이하의 홀수 출력
        for (int i = a; i <= b; i += 2) {
            System.out.print(i + " ");
        }
        
        scanner.close();
    }
}