/*import java.util.*;
public class practical3_main {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter size of array : ");
       int s=sc.nextInt();
       System.out.println("Enter array : ");
       int a[] = new int[s];
       for(int i=0;i<s;i++)
       {
           a[i]=sc.nextInt();
       }
       practical3 obj = new practical3();
       boolean flag=obj.array123(a);
       System.out.println(flag);
    }
    
}*/
import java.util.Scanner;
public class practical4_main
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in); 
System.out.print("Enter Size of Array : "); int x=sc.nextInt(); System.out.print("Enter Array : ");
int a[]=new int[x]; 
for(int i=0;i<x;i++)
{
a[i]=sc.nextInt();
}
practical4 obj = new practical4();
boolean c=obj.array123(a);//calling method of class file.
System.out.println(c);
}
}

