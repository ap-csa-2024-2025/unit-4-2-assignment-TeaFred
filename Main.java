import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int lowerB;
    int upperB;

    System.out.println("Please enter two integers: ");
    lowerB = sc.nextInt();
    upperB = sc.nextInt();
    int theNumNCount = lowerB;

    while ((theNumNCount >= lowerB)  && (theNumNCount <=upperB))
    {
      if (theNumNCount % 2 == 1)
      {
        System.out.println(theNumNCount);
      }
      theNumNCount++;
    }
  }
}
