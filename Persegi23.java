import java.util.Scanner;
public class Persegi23 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nilai N = ");
    int N = sc.nextInt();
    String number = N + "";
    for(int i=1; i<=N; i++) {
        for(int j=1; j<=N; j++) {
            if (i==1||i==N||j==1||j==N) {
            System.out.print(number + "  ");
            } else {
                System.out.print("   ");
        }
    }
        System.out.println();
        }
    }
}
