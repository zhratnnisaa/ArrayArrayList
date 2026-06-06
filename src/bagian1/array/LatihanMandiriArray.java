package bagian1.array;

public class LatihanMandiriArray {
    public static void main(String[] args) {
        // SOAL 1: Array Suhu Harian (double) - Mencari Tertinggi & Terendah
        System.out.println("=== SOAL 1: SUHU HARIAN ===");
        double[] suhuHarian = {31.5, 29.0, 34.2, 28.5, 30.0, 33.8};
        double suhuTertinggi = suhuHarian[0];
        double suhuTerendah = suhuHarian[0];
        for (double suhu : suhuHarian) {
            if (suhu > suhuTertinggi) {
                suhuTertinggi = suhu;
            }
            if (suhu < suhuTerendah) {
                suhuTerendah = suhu;
            }
        }
        System.out.print("Data Suhu      : ");
        for (double suhu : suhuHarian) {
            System.out.print(suhu + " C  ");
        }
        System.out.println("\nSuhu Tertinggi : " + suhuTertinggi + " C ");
        System.out.println("Suhu Terendah  : " + suhuTerendah + " C ");
        System.out.println();

        // SOAL 2: Array Nama Hari - Cetak Hari dengan Lebih dari 5 Huruf
        System.out.println("=== SOAL 2: FILTER NAMA HARI ===");
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        System.out.println("Hari yang memiliki lebih dari 5 huruf:");
        for (String hari : namaHari) {
            if (hari.length() > 5) {
                System.out.println(hari + " (Jumlah huruf: " + hari.length() + ")");
            }
        }
        System.out.println();
        
        // SOAL 3: Array Angka - Menghitung Jumlah Angka Genap
        System.out.println("=== SOAL 3: HITUNG ANGKA GENAP ===");
        int[] angka = {4, 8, 15, 16, 23, 42};
        int jumlahGenap = 0;
        for (int n : angka) {
            if (n % 2 == 0) {
                jumlahGenap++;
            }
        }

        System.out.print("Data Angka         : ");
        for (int n : angka) {
            System.out.print(n + " ");
        }
        System.out.println("\nBanyak Angka Genap : " + jumlahGenap);
    }
}