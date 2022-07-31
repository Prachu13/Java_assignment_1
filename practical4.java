/*public class practical3 {
    static boolean array123(int[] a)
    {
      
        for(int i=0;i<a.length;i++)
        {
           if(a[i]=='1' && a[i+1]=='2' && a[i+2]=='3')
           {
              return true;
           }
        }  
        return false;  
}
    
}*/
public class practical4
{
   static boolean array123(int[] a)
   {
   for(int i=0;i<a.length;i++)
   {
   if(a[i]==1 && a[i+1]==2 && a[i+2]==3)//check number of 1,2 and 3 are sequence in array.
   {
   return true;
   }
   }
   return false;
   }
   
}

