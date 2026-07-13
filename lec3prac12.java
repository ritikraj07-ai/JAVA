import java.util.*;
public class lec3prac12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        String cal = sc.next();
        float b = sc.nextFloat();

        switch(cal) {
            case "+" :System.out.println(a+b);
            break;
            case "-" :System.out.println(a-b);
            break;
            case "*" :System.out.println(a*b);
            break;
            case "/" :
                if (b==0) {
                    System.out.println("denominator cannot be zero");
                } else {
                    System.out.println(a/b);
                    break;
                }
            case "%" :System.out.println(a%b);
            break;
            default :System.out.println("not found");
        }
        sc.close();
    }
}
