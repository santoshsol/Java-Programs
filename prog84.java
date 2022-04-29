import java.util.*;
// program Tital : Take Chracter From user  Swap the that  characters    
// Date /10/12/2021/ 
// using Helper Function

class prog84 
{    void Swap(char p , char q)
   {
      char Temp;
      Temp = p;
       p = q;
       q = Temp;
       
       System.out.printf(" After swapping character are %c %c\n",+Temp);
      }


   public static void main(String arg[])
   {
        Scanner sobj = new Scanner(System.in);
        char ch1 = 0, ch2 = 0;

         System.out.println(" Enter Character\n");
         ch1 = sobj.next(). charAt(0);

        System.out.println(" Enter Second Character");
        ch2 = sobj.next().charAt(0);

        System.out.printf("Before swapping characters are %c %c\n",ch1,ch2);

        prog84 obj = new prog84();
        obj.Swap(ch1,ch1);
        
        System.out.printf(" After swapping character are %c %c\n",ch1,ch2);
        
   }
}
