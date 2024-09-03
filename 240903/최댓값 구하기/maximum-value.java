import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner로 입력 받기
        Scanner sc = new Scanner(System.in);
        
        // 세 정수를 입력받음
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // Math.max를 사용하여 최댓값 계산
        int max = Math.max(a, Math.max(b, c));
        
        // 최댓값 출력
        System.out.println(max);
    }
}