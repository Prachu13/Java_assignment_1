import java.util.*;
public class practical7_main {
    public static void main(String[] args)
{
int row;
Scanner sc= new Scanner(System.in);
System.out.print("Enter the number one less than the number rows you want in Pyramid : ");
row=sc.nextInt();
practical7 obj = new practical7(); obj.Pyramid(row);//calling method of class file.
}

    
}
