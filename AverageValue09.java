import java.util.Scanner;
public class AverageValue09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i;
        int j;
        float nilai, totalNIlai, rataNilai;
        i = 1;
        while (i<=5) {
            System.out.println("Input Nilai Mahasiswa ke " + i);
            totalNIlai = 0;
            for (j=1; j<=5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilai = sc.nextInt();
                totalNIlai += nilai;
            }
            rataNilai = totalNIlai/5;
            System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah "  + rataNilai);
            i++;
        }
    }
}