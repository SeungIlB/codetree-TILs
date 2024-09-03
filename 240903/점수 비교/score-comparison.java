import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int mathA = sc.nextInt();
        int EnA = sc.nextInt();
        int mathB = sc.nextInt();
        int EnB = sc.nextInt();

        if(mathA > mathB && EnA > EnB){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}