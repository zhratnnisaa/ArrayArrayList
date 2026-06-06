//Nama : Zahratunnisa
//NPM  : 2410010299

package tugas;

public class MainTugas {
    public static void main(String[] args) {

        // Poin 4: Array mata kuliah (ukuran tetap, minimal 3)
        String[] mataKuliah = {"Pemrograman Berorientasi Objek", "Struktur Data", "Basis Data"};
        System.out.println("===== Daftar Mata Kuliah =====");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }

        // Membuat objek KelasKuliah
        KelasKuliah kelas = new KelasKuliah();

        // Menambah minimal 5 mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Zahratunnisa",           "2410010299", 97.0));
        kelas.tambahMahasiswa(new Mahasiswa("Elyza Nurfarina R.M",    "2410010431", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Balqis",                 "2410010076", 72.5));
        kelas.tambahMahasiswa(new Mahasiswa("Oksi Fitria Hawini",     "2410010103", 45.0));
        kelas.tambahMahasiswa(new Mahasiswa("Aldin Noor Akhmad",      "2410010583", 90.0));

        // Tampilkan semua mahasiswa
        kelas.tampilkanSemua();

        // Poin 5: Rata-rata dan jumlah lulus
        System.out.println("\n===== Statistik Nilai =====");
        System.out.printf("Rata-rata nilai : %.2f%n", kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus() + " mahasiswa");

        // Poin 6: Tambah mahasiswa baru, tampilkan ulang
        System.out.println("\n>> Menambahkan mahasiswa baru...");
        kelas.tambahMahasiswa(new Mahasiswa("Enru Rizky Saputra", "2410010143", 68.0));
        System.out.println();
        kelas.tampilkanSemua();
    }
}