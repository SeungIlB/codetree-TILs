import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력을 받기 위해 Scanner 사용
        Scanner sc = new Scanner(System.in);
        
        // 첫 번째 사람의 나이와 성별 입력
        int age1 = sc.nextInt();
        String sex1 = sc.next();
        
        // 두 번째 사람의 나이와 성별 입력
        int age2 = sc.nextInt();
        String sex2 = sc.next();
        
        // 조건을 확인하여 결과 출력
        if (sex1.equals("M") && sex2.equals("M") && (age1 >= 19 || age2 >= 19)) {
            System.out.println(1);
        }
    }
}