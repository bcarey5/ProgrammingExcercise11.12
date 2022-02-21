package src;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

class TestProgram {

  @Test
  void test() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 5 numbers:");
    ArrayList<Double> values = inputArray(input, 5);
    double total = sum(values);
    System.out.println("Total is: " + total);
  }

  public static ArrayList<Double> inputArray(Scanner input, int numberOfPoints) {
    ArrayList<Double> values = new ArrayList<>();

    for (int i = 0; i < numberOfPoints; i++) {
      values.add(input.nextDouble());
    }

    return values;
  }

  public static double sum(ArrayList<Double> list) {
    double total = 0.0;

    for (Double num : list) {
      total += num;
    }

    return total;
  }
}
