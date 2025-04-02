import java.util.Scanner;

public class PascalTriangle {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter triangle size: ");
    int n = sc.nextInt();
    sc.close();

    int[][] array = new int[n][0];

    for (int i = 0; i < n; i++) {

      array[i] = new int[i + 1];
      for (int j = 0; j <= i; j++) {

        if (j == 0 || j == i) {
          array[i][j] = 1;
        } else {
          array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
        }
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {

        System.out.printf("%d ", array[i][j]);
      }

      System.out.println();
    }
  }
}
