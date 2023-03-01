//Adds scanner class
import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int number;
    int column;
    int firstRow = 1;

    Scanner input = new Scanner(System.in);
    System.out.println("Enter any positive integer: ");
    number = input.nextInt();

    //Coding for odd integer input
    if (number % 2 != 0) {
      //Prints upper half of diamond
      do {

        //Controls whitespace before stars are printed
        column=1;
        do {
            System.out.print(" ");
            }
        while (++column <= (number+1) - firstRow + 1);

        //Determines number of stars printed on each row
        column=1;
        do {
          System.out.print("*");
        }
        while (++column <= firstRow * 2 - 1);

        //Moves to the next line to print next set of stars
        System.out.println();
      }
      while ((++firstRow)*2 <= (number+1));

      //Prints lower half of diamond
      firstRow = ((number + 1)/2) - 1;
      do {

        column = 1;
        do {
          System.out.print(" ");
        }
        while (++column <= (number + 1) - firstRow + 1);

        column = 1;
        do {
          System.out.print("*");
        }
        while (++column <= firstRow * 2 -1);

        System.out.println();
      }

      while (--firstRow > 0);
    }

    //Coding for even integer input
    if (number % 2 == 0) {
      //Prints upper half of diamond
      do {

        //Controls spacing before stars are printed
        column=1;
        do {
            System.out.print(" ");
            }
        while (++column <= number- firstRow);

        //Determines number of stars printed on each row
        column=1;
        do {
          System.out.print("*");
        }
        while (++column <= firstRow * 2);

        //Separates each single line of stars from the next
        System.out.println();

      }
      while ((++firstRow)*2 <= number);

      //Prints second half of diamond
      firstRow = (number/2) - 1 ;
      do {

        //Controls white-space before stars
        column = 1;
        do {
          System.out.print(" ");
        }
        while (++column <= number - firstRow);

        //Controls number of stars on each row
        column = 1;
        do {
          System.out.print("*");
        }
        while (++column <= firstRow * 2);
        System.out.println();
      }

      while (--firstRow > 0);
    }
  }
}
