import java.util.*;
// program Tital : Take Chracter From user and Count Vowles  in String  
// Count Small && Capital
// Date /25/1/2022/ 

class prog81
{     
     int CountVowles(String str)
     {
        int i = 0, iCnt = 0;
        char ch = 0;

        for(i = 0; i<str.length(); i++)
        {
            ch = str.charAt(i); // Conver String To Character Array

             if((ch =='a')||(ch =='e')|| (ch == 'i')|| (ch == 'o')|| (ch =='u')||(ch =='A')||
              (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U'))
              {
                  iCnt++;
              }
             ch++;
           }
        return iCnt;
  }
    
    public static void main(String arg[])
    {
         Scanner sobj = new Scanner(System.in);
         String str;
         int iret = 0;

         System.out.println(" Enter String");
         str = sobj.nextLine(); // give input in String 

         prog81 obj = new prog81(); // Cerate obj
         iret = obj.CountVowles(str); // Function Call

         System.out.println("Count Vowles>> "+iret);
    }
}