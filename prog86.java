import java.util.*;
// program Tital : Take Number From user Display that Number Binaray   To Dicimal    
// Date /29/1/2022/ 
// using Helper Function
class prog86 
{        
       void DisplayBinaray(int ino)
       {    int iDigit = 0;
            // purn Numbrchi devision kra
         while (ino>0) 
            { // mood opertor Reminder dyto
                //  %2    | 10 |  0  |
              iDigit = ino %2;            //  %2    |  5 |  1  |
              System.out.print(iDigit);        //  %2    |  2 |  0  |
              ino = ino / 2;              //  %2    |  1 |  1  |
            }
       }
     
       public static void main (String arg[])
     {
        Scanner sobj = new Scanner(System.in);
        int value = 0;

        System.out.println("Enter Number\n ");
        value = sobj.nextInt();
    
         prog86 obj = new prog86();
         
         obj.DisplayBinaray(value);

    }
}

