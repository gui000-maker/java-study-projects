import java.util.Scanner;

public class hello_worlds {
  static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter number of worlds: ");
    int iterations = scanner.nextInt();

    int i = 0;

    while (i < iterations) {
      System.out.println("Hello world!");
      i = i + 1;
    }
    scanner.close();
  }
}