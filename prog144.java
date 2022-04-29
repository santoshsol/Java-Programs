import java .util.*;
import java.util.*;
//  program Tital :: Take number from  user And cerate Array  Addition OF  total Number of Array that Number  
//  Display input  
class prog144 
{
    public static void main (String arg[])
    {
       Scanner sobj = new Scanner(System.in);
       int ino1 = 0, iCnt  = 0,  sum = 0;
       System.out.println(" Enter First Number of Elements\n");
        ino1 = sobj. nextInt();
        
      System.out.println(" Enter Number");
      int Arr[] =  new int[ino1];
      
      for(iCnt = 0; iCnt<Arr.length; iCnt++)
      {
         Arr[iCnt] = sobj.nextInt();


      }
      
      for(iCnt = 0; iCnt<Arr.length; iCnt++)
      {
              sum = sum + Arr[iCnt];
         
      }
      System.out.println(" Addtion is "+sum);
    }

}
