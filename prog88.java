import java.util.*;
// Make String Revrse 

class prog88 
{
   public static void main(String arg[])
   {
        Scanner sobj = new Scanner(System.in);
         String str;

        System.out.println(" Enter String");
         str = sobj.nextLine();

       StringBuffer sobj1 = new StringBuffer(str);  // cerate Second obj
       System.out.println(" output iS::"+sobj1.reverse());

   }
    
}
