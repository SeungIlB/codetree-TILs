import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String p = "";
        if(n == 1){
            p = "John";
        }
        else if(n == 2){
            p = "Tom";
        }
        else if(n == 3){
            p = "Paul";
        }
        else {
            p = "Vacancy";
        }
        System.out.println(p);
    }
}