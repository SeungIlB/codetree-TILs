import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        if(a > b){
            result = a - b;
            System.out.println(result);
        }
        else{
            result = b - a;
            System.out.println(result);
        }
    }
}