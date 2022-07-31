import java.util.*;
public class practical3_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a=sc.nextInt();
        System.out.println("Enter second number : ");
        int b=sc.nextInt();
        practical3 obj = new practical3();
        boolean c = obj.lastDigit(a, b);
        System.out.println(c);

    }
}
