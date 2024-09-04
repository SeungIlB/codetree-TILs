import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 정수 b와 a 입력받기
        int b = scanner.nextInt();
        int a = scanner.nextInt();

        // b에서 a까지 짝수를 내림차순으로 출력
        int current = b;
        
        while (current >= a) {
            System.out.print(current + " ");
            current -= 2; // 짝수만을 출력하기 위해 2씩 감소
        }

        scanner.close();
    }
}