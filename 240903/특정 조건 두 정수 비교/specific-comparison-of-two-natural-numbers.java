import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = 0;
        if(a < b){
            answer = 1;
            System.out.printf("%d ",answer);
        }
        else{
            answer = 0;
            System.out.printf("%d ",answer);
        }
        if(a == b){
            answer = 1;
            System.out.printf("%d ",answer);
        }
        else{
            answer = 0;
            System.out.printf("%d ",answer);
        }
    }
}