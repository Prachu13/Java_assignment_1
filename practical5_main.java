import java.util.Scanner;
public class practical5_main {
    public static void main(String[] args)
{
Scanner sc=new Scanner(System.in); System.out.print("Enter First String : "); String a=sc.nextLine(); System.out.print("Enter Second String : "); String b=sc.nextLine();
practical5 obj = new practical5();
int c=obj.stringMatch(a, b);//calling method of class file.
System.out.println(c);
}   
}
