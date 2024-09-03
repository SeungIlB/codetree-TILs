import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int AMath = sc.nextInt();
        int AEnglish = sc.nextInt();
        int BMath = sc.nextInt();
        int BEnglish = sc.nextInt();

        if(AMath > BMath){
            System.out.println("A");
        }
        else if(AMath == BMath && AEnglish > BEnglish){
            System.out.println("A");
        }
        else{
            System.out.println("B");
        }

    }
}