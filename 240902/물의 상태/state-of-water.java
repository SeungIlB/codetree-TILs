import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        String c = "";

        if(temp < 0){
            c = "ice";
        }
        else if(temp >= 100){
            c = "vapor";
        }
        else{
            c = "water";
        }
        System.out.println(c);
    }
}