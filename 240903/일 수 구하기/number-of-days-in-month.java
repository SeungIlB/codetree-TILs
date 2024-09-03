import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력 받기
        Scanner sc = new Scanner(System.in);
        
        // 월 입력 받기
        int n = sc.nextInt();
        
        // 해당 월에 따라 일 수 출력
        switch(n) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println(31);
                break;
            case 4: case 6: case 9: case 11:
                System.out.println(30);
                break;
            case 2:
                System.out.println(28);
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}