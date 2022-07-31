import java.util.Scanner;
public class practical10_main {
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in); String s1;
System.out.println("Enter Message"); 
s1 = sc.nextLine();
practical10 obj = new practical10(); 
obj.Caesar_Cipher(s1);//calls the constructor of class file.
}

    
}
