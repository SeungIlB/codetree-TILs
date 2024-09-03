import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 첫 번째 사람의 정보 입력
        int age1 = sc.nextInt();
        String sex1 = sc.next();
        
        // 두 번째 사람의 정보 입력
        int age2 = sc.nextInt();
        String sex2 = sc.next();
        
        // 조건 체크: 두 사람 중 한 명이라도 19세 이상이면서 남자인 경우
        if ((sex1.equals("M") && age1 >= 19) || (sex2.equals("M") && age2 >= 19)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}