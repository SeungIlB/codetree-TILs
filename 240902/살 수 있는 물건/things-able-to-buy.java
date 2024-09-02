import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String obj = "";
        if(n >= 3000){
            obj = "book";
        }
        else if(n < 3000 && n >= 1000){
            obj = "mask";
        }
        else {
            obj = "no";
        }
        System.out.println(obj);
        
    }
}