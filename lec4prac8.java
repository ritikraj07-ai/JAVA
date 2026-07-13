import java.util.*;
public class lec4prac8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int n = sc.nextInt();
        int mult = 0;

        for(int i =1;i<=n;i++) {
            mult = user*i;
            System.out.println(mult);
        }
        sc.close();
    }
}

