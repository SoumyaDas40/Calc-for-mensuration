//importing libary
import java.util.*;
import java.lang.*;

public class Main {
  // creating public static void main
  public static void main(String[] args) {
    // creating function for line break
    String newline = System.getProperty("line.separator");

    // creating a input/output system for the length and breadth
    Scanner obj = new Scanner(System.in);

    // Perimeter or Area
    System.out.println("What do you want,if square then 1 else if rectangle then 2 ?");
    int want = obj.nextInt();

    // condition for other number
    if (want > 2) {
      System.out.println("Please a correct value");
    }
    // conditions for the required number
    else {

      // Square
      if (want == 1) {
        // creating a input/output system for the length and breadth
        System.out.println("If you want find the area and the peremeter type 1 else 2 for other problems : ");
        int get = obj.nextInt();

        if (get == 1) {
          System.out.println("Enter the side of the square: ");
          int side = obj.nextInt();

          // calculating the area and perimeter of the square
          int sqp = 4 * side;
          int sqa = side * side;
          System.out.println("Perimeter of the square is " + sqp);
          System.out.println("Area of the square is " + sqa);
        }

        if (get == 2) {
          System.out.println("Pressed 1 if you want to find the side from perimeter and area " + newline
              + "Pressed 2 if you want to find the any value based on total surface / lateral surface area or volume");
          int val = obj.nextInt();

          if (val == 1) {
            System.out
                .println("Get the side from permeter then type 1" + newline + "Get the side from area then type 2");
            int valuio = obj.nextInt();

            if (valuio == 1) {
              System.out.println("Value of perimeter ? ");
              int peri = obj.nextInt();
              double per = peri / 4.0;
              System.out.println("The side of a square from " + peri + "will be " + per);
            }

            if (valuio == 2) {
              System.out.println("Area of the square ?");
              int ar = obj.nextInt();
              System.out.println("The side of a square from " + ar + "will be " + Math.sqrt(ar));
            }
          }

          if (val == 2) {
            System.out.println(
                "Type 1 to get the volume of the cube" + newline + "Type 2 to get the total surface area of the cube"
                    + newline + "Type 3 to get the lateral surface area of the cube" + newline + "Type 4 for extra");

            int asd = obj.nextInt();
            if (asd == 1) {
              System.out.println("Edge of the cube ?");
              int vol = obj.nextInt();
              double volm = vol * vol * vol;
              System.out.println("The voloume of the cube with a edge of " + vol + " will be " + volm);
            }
            if (asd == 2) {
              System.out.println("Edge of the cube ?");
              int tsof = obj.nextInt();
              double tsuf = 6 * tsof * tsof;
              System.out.println("The total surface area of the cube with a edge of " + tsof + " will be " + tsuf);
            }
            if (asd == 3) {
              System.out.println("Edge of the cube ?");
              int lsof = obj.nextInt();
              double lsuf = 4 * lsof * lsof;
              System.out.println("The lateral surface area of the cube with a edge of " + lsof + " will be " + lsuf);
            }
          }
        }
      }
    }

    // rectangle
    if (want == 2) {
      // creating a input/output system for the length and breadth
      System.out.println("Enter the length of the rectangle: ");
      int length = obj.nextInt();
      System.out.println("Enter the breadth of the rectangle: ");
      int breadth = obj.nextInt();

      // calculating the area and perimeter of the rectangle
      int perimeter = 2 * (length + breadth);
      int area = length * breadth;
      System.out.println("Perimeter of the rectangle is " + perimeter + newline);
      System.out.println("Area of the rectangle is " + area);
    }
  }
}
