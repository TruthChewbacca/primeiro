

import java.util.Scanner;
 
class sum
{
   public static void main(String args[])
   {
      int x, y, z;
      System.out.println("Digite os dois numeros para somar: ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      y = in.nextInt();
      z = x + y;
      System.out.println("Soma dos numeros = "+z);
   }
}