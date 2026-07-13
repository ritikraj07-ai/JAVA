import java.util.*;
public class lec4prac7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int n = sc.nextInt();
        int multiplication = 0;
        for (int i = 1; i <= n; i++) {
            multiplication = user * i;
            System.out.println(multiplication);
        }
        
        sc.close();
    }
}
