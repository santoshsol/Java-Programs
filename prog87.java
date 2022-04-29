import java.util.*;
// program Title : Take Number From user Display that Number  Dicimal And Hexadecimal Format 
// Date /10/12/2021/ 
// using Helper Function
class prog87 
{
    public static void main (String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int ino1 = 0;

        System.out.println(" Enter Number\n");
        ino1 = sobj.nextInt();

        System.out.println(" It's Decimal format is:"+ino1);
        System.out.println(String. format("It is Hexadecimal format is :%x",ino1)); 
    
  }
}