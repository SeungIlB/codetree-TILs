import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        String result = "";
        
        // 문자열 비교는 equals() 메서드를 사용해야 함
        if(ch.equals("S")){
            result = "Superior";
        }
        else if(ch.equals("A")){
            result = "Excellent";
        }
        else if(ch.equals("B")){
            result = "Good";
        }
        else if(ch.equals("C")){
            result = "Usually";
        }
        else if(ch.equals("D")){
            result = "Effort";
        }
        else {
            result = "Failure";
        }
        
        System.out.println(result);
    }
}