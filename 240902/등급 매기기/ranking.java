import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        String grade = "";

        if(score >= 90){
            grade = "A";
        }
        else if(score >= 80 && score < 90){
            grade = "B";
        }
        else if(score >= 70 && score < 80){
            grade = "C";
        }
        else if(score >= 60 && score < 70){
            grade = "D";
        }
        else if(score < 60){
            grade = "F";
        }
        System.out.println(grade);
    }
}