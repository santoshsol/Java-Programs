import java .util.*;

class prog143 
{
   public static void main (String arg[])
   {
      Scanner Sobj = new Scanner(System.in);
       int ino1 = 0, iCnt = 0;

     System.out.println(" Enter Number");
      ino1 = Sobj.nextInt();

      int Arr[] = new  int [ino1];

      System.out.println(" Enter Number");

      for(iCnt = 0; iCnt<Arr.length; iCnt++)
      {
           Arr[iCnt] = Sobj.nextInt();
      }
      System.out.println(" Enterd Number Are");
      
      for(iCnt = 0; iCnt<Arr.length; iCnt++)
      {
           System.out.println( Arr[iCnt]);
      }

   }
}
