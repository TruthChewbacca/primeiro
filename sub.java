

import java.util.Scanner;
 
class sub
{
   public static void main(String args[])
   {
      int x, y, z;
      System.out.println("Digite os dois numeros para subtrair: ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
      y = in.nextInt();
      z = x - y;
      System.out.println("Subtracao dos numeros = "+z "Ou não é esse o resultado...");
   }
}