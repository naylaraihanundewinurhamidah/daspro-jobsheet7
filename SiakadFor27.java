import java.util.Scanner;

public class SiakadFor27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nilai, tertinggi = 100, terendah = 0;
        int jmlhLulus = 0, jmlTdkLulus = 0;

        for(int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = scanner.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
           
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        scanner.close();
    }
}