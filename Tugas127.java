import java.util.Scanner;

public class Tugas127 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket, totalHarga, totalHargaSetelahDiskon, totalTiketTerjual = 0, totalHargaPenjualan = 0;
        double diskon = 0.0;
        String jawaban = "";

        do {
            System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
            jumlahTiket = scanner.nextInt();

            if (jumlahTiket <= 0) {
                System.out.println("Input tidak valid! Silakan masukkan ulang.");
                continue;
            }

            totalHarga = jumlahTiket * hargaTiket;
            
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0.0;
            }

            totalHargaSetelahDiskon = (int) (totalHarga - (totalHarga * diskon));
            totalTiketTerjual += jumlahTiket;
            totalHargaPenjualan += totalHargaSetelahDiskon;

            System.out.println("Total harga sebelum diskon: Rp " + totalHarga);
            System.out.println("Diskon yang diberikan: " + (int)(diskon * 100) + "%");
            System.out.println("Total harga setelah diskon: Rp " + totalHargaSetelahDiskon);
            scanner.nextLine(); 

            System.out.print("Apakah Anda ingin membeli tiket lagi? (ya/tidak): ");
            jawaban = scanner.next(); 

        } while (jawaban.equalsIgnoreCase("ya"));

        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total harga penjualan: Rp " + totalHargaPenjualan);

        scanner.close();
    }
}