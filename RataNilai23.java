import java.util.Scanner;
public class RataNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i  = 1, j;
        float nilaiMhs, totalNilai, rataNilai;
        while (i<=5) { 
            totalNilai = 0;
            System.out.println("Input Nilai Mahasiswa ke " + i);
           for(j=1; j<=5; j++) {
            System.out.println("Nilai ke-" +j + " = ");
            nilaiMhs = sc.nextFloat();
            totalNilai+=nilaiMhs;
            }
            rataNilai=totalNilai/5;
            System.out.print("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
            System.out.println();
            i++;
        }
    }   
}