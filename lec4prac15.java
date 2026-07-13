import java.util.*;
public class lec4prac15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write the number : ");
        int a = sc.nextInt();
        int i = 1;

        do {
            System.out.println(a+ "X"+ i+ "="+ (a*i));
            i++;
        } while (i<11);
        sc.close();
    }
}
