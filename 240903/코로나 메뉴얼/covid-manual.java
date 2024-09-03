import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner로 입력 받기
        Scanner sc = new Scanner(System.in);

        // A로 분류된 사람의 수를 카운팅할 변수
        int countA = 0;

        // 3명에 대한 정보를 입력받고 분류
        for (int i = 0; i < 3; i++) {
            // 감기 증상과 체온 입력 받기
            String symptom = sc.next();  // Y 또는 N
            int temperature = sc.nextInt();  // 체온

            // 분류 조건 확인
            if (symptom.equals("Y") && temperature >= 37) {
                countA++;  // A로 분류되면 카운트 증가
            }
        }

        // A로 분류된 사람이 2명 이상일 경우 위급상황
        if (countA >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}