import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int middlescore = sc.nextInt();
        int finalscore = sc.nextInt();

        if(middlescore < 90){
            System.out.println(0);
        }
        else if(finalscore >= 95){
            System.out.println(100000);
        }
        else if(finalscore >=90){
            System.out.println(50000);
        }
        else {
            System.out.println(0);
        }
    }
}