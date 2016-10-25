public class Switch 
{
    public static void main(String[] args) 
    {
       char penaltyKick = 'C';
       switch (penaltyKick) 
       {
         case 'L': System.out.println("Martin shoots to the left and scores!");
         break; 
         case 'C': System.out.println("Martin shoots down the center, but the keeper blocks it!");
         break;
	 case 'F': System.out.println('Henrik pa aventyr');
 	 break;
	 case 'J': System.out.println('Henrik pa aventyr igen');
 	 break;
	 case 'K' : System.out.println('added from github');
         break;
         default:
         System.out.println("MrT is in position...");

        }

      }
      /** the snippet returns the minimum between two numbers */

      public static int minFunction(int n1, int n2) 
      {
      int min;
      if (n1 > n2)
         min = n2;
      else
        min = n1;
      return min; 
     }
  }


# test line
