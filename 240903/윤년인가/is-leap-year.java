import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner를 사용하여 입력을 받습니다.
        Scanner sc = new Scanner(System.in);
        
        // 자연수 y 입력 받기
        int y = sc.nextInt();
        
        // 윤년 조건을 체크합니다.
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            System.out.println("true");  // 윤년일 경우 true 출력
        } else {
            System.out.println("false"); // 평년일 경우 false 출력
        }
    }
}