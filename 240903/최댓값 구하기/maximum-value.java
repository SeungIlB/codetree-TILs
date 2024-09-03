import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         // Scanner로 입력 받기
//         Scanner sc = new Scanner(System.in);
        
//         // 세 정수를 입력받음
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
        
//         // Math.max를 사용하여 최댓값 계산
//         int max = Math.max(a, Math.max(b, c));
        
//         // 최댓값 출력
//         System.out.println(max);
//     }
// }


public class Main {
    public static void main(String[] args) {
        // Scanner를 사용하여 입력 받기
        Scanner sc = new Scanner(System.in);
        
        // 세 정수를 입력받습니다.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // 조건문을 사용하여 최댓값 찾기
        int max = a;  // 처음엔 max에 a 값을 넣어줍니다.
        
        if (b > max) {
            max = b;  // b가 max보다 크면 max를 b로 업데이트
        }
        
        if (c > max) {
            max = c;  // c가 max보다 크면 max를 c로 업데이트
        }
        
        // 최댓값 출력
        System.out.println(max);
    }
}