package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    // Menyimpan koleksi objek Mahasiswa
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    // Method menambah mahasiswa
    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    // Method menghitung rata-rata nilai kelas
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) 
            return 0;
        
        double total = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    // Method menghitung jumlah mahasiswa yang lulus
    public int jumlahLulus() {
        int count = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) count++;
        }
        return count;
    }

    // Method mengembalikan jumlah total mahasiswa saat ini
    public int getJumlahMahasiswa() {
        return daftarMahasiswa.size();
    }
    
    // Method menampilkan seluruh mahasiswa
    public void tampilkanSemua() {
        System.out.println("\n===== Daftar Mahasiswa =====");
        System.out.printf("%-20s %-15s %-10s %s%n", "Nama", "NPM", "Nilai", "Status");
        System.out.println("------------------------------------------------------------");
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.printf("%-20s %-15s %-10.1f %s%n",
                m.getNama(), m.getNpm(), m.getNilai(),
                m.lulus() ? "Lulus" : "Tidak Lulus");
        }
        System.out.println("Total data: " + daftarMahasiswa.size());
    }
}