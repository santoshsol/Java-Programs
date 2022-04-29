import java .util.*;
//  check prime Number
class prog141
{
   public static void main (String arg []) 
   {
        Scanner sobj = new Scanner(System.in);
        int ino1 = 0;
        boolean iret = false;

        System.out.println(" Enter First Number\n");
        ino1 = sobj. nextInt();
        
        Marvellous mobj = new Marvellous();
        iret = mobj. CheckPrime(ino1);
        if(iret == true)
        {
            System.out.println(" It is Prime Number\n");
        }
        else
        {
            System.out.println(" It is Not Prime Number\n");
        }  
        
   }
}

 class Marvellous
 {
     boolean CheckPrime(int ino2)
     {  int iCnt =0;
        boolean bFlag = true;
        for(iCnt = 2; iCnt<=ino2/2; iCnt++)
        {
            if((ino2 % iCnt) == 0)
            {
                  bFlag = false;
                 break; 
            }
        }
        return bFlag;
    }
 }