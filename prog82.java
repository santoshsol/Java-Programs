
import java.util.*;
// program Title: Take Chracter From user and Count Frecvancey that Chracter in String   
// Date /25/1/2022/ 

class prog82 
{   int Frecvancey(String str2, int ino)
    {   
         int i = 0, iCnt = 0;
         char ch = 0;

     for(i = 0; i<str2.length(); i++)
       {
          ch = str2.charAt(i); // Conver String To Character Array
          if(ch == ino) 
          {
                iCnt++;     
          }
         ch++;
      }
    return iCnt; 
 }
   public static void main (String arg[])
   {
        Scanner sobj = new Scanner(System.in);
        String str;
        char ch = 0;
        int iret = 0;

         System.out.println(" Enter String");
         str = sobj.nextLine();

        System.out.println(" Enter Character");
         ch = sobj.next().charAt(0); 

        prog82 obj = new prog82();
        iret = obj.Frecvancey(str ,ch);


        System.out.println(" Frecvancey is>>"+iret);
         
   }
}
