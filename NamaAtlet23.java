import java.util.Scanner;

public class NamaAtlet23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String cabor, namaAtlet;
    int i = 1;
    int j = 1;
    System.out.println("=======Data Nama Atlet Porseni 2024=======");
    while (i <= 5) { 
      System.out.println("Politeknik ke-" + i);
      for (j = 1; j <= 4; j++) {
        System.out.print("Cabang olahraga: ");
        cabor = sc.nextLine();
        for (int k = 1; k <= 5; k++) {
          System.out.print(k+ ". ");
          namaAtlet = sc.nextLine();
        }
      }
      System.out.println();
      i++;  
    }
  }
}