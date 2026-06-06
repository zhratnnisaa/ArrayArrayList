package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList {
    public static void main(String[] args) {
        // SOAL 1: ArrayList Daftar Belanja
        System.out.println("=== SOAL 1: DAFTAR BELANJA ===");
        ArrayList<String> daftarBelanja = new ArrayList<>();

        daftarBelanja.add("Beras");
        daftarBelanja.add("Minyak Goreng"); // Ini item ke-2 (indeks 1)
        daftarBelanja.add("Telur");
        daftarBelanja.add("Gula");
        
        System.out.println("Daftar Belanja Awal : " + daftarBelanja);
        daftarBelanja.remove(1);

        System.out.println("Setelah Hapus Item  : " + daftarBelanja);
        System.out.println("Jumlah Akhir List   : " + daftarBelanja.size() + " item");
        System.out.println();
        
        // SOAL 2: ArrayList Angka - Mencari Nilai Terbesar
        System.out.println("=== SOAL 2: MENCARI NILAI TERBESAR ===");
        ArrayList<Integer> daftarAngka = new ArrayList<>();
        daftarAngka.add(65);
        daftarAngka.add(88);
        daftarAngka.add(92);
        daftarAngka.add(45);
        daftarAngka.add(70);

        int nilaiTerbesar = daftarAngka.get(0);
        for (int angka : daftarAngka) {
            if (angka > nilaiTerbesar) {
                nilaiTerbesar = angka;
            }
        }
        
        System.out.println("Data Angka     : " + daftarAngka);
        System.out.println("Nilai Terbesar : " + nilaiTerbesar);
        System.out.println();

        // SOAL 3: Filter Nama yang Diawali Huruf 'A'
        System.out.println("=== SOAL 3: FILTER HURUF 'A' ===");
        ArrayList<String> daftarNama = new ArrayList<>();
        daftarNama.add("Andi");
        daftarNama.add("Budi");
        daftarNama.add("Anisa");
        daftarNama.add("Citra");
        daftarNama.add("Ahmad");
        daftarNama.add("Dedi");
        
        System.out.println("Semua Nama Data: " + daftarNama);
        System.out.println("Nama yang diawali huruf 'A':");
        for (String nama : daftarNama) {
            if (nama.startsWith("A")) {
                System.out.println("- " + nama);
            }
        }
    }
}