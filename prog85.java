import java .util.*;
// program Title : Take String From user And Revrse that String     
// Date /29/1/2022/ 
// using Helper Function


  // Second Format write program Revrse String
class prog285
{
     public static void main(String a[])
     {
          Scanner sobj = new Scanner(System.in);

          System.out.println(" Enter string");
          String s = sobj .nextLine();

          StringBuffer sobj1 = new StringBuffer(s);
          System.out.println(" output is:"+sobj1.reverse());
     }
}