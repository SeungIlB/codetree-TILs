import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        String season = "";
        if(s >= 3 && s <= 5){
            season = "Spring";
        }
        else if(s >= 6 && s <= 8){
            season = "Summer";
        }
        else if(s >= 9 && s <= 11){
            season = "Fall";
        }
        else {
            season = "Winter";
        }
        System.out.println(season);
    }
}