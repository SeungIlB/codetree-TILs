import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double e1 = sc.nextDouble();
        double e2 = sc.nextDouble();

        if(e1 >= 1.0 && e2 >= 1.0){
            System.out.println("High");
        }
        else if(e1 >= 0.5 && e2 >= 0.5){
            System.out.println("Middle");
        }
        else {
            System.out.println("Low");
        }


    }
}