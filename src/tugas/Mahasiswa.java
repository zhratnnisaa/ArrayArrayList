package tugas;

public class Mahasiswa {
    //Atribut
    private String nama;
    private String npm;
    private double nilai;

    //Constructor
    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    //Getter
    public String getNama() { 
        return nama; }
    
    public String getNpm() { 
        return npm; }
    
    public double getNilai() { 
        return nilai; }

    // Method untuk mengecek kelulusan (nilai >= 60)
    public boolean lulus() {
        return nilai >= 60;
    }
    
    // Method pembantu untuk cetak info mahasiswa
    public String info() {
        String status = lulus() ? "LULUS" : "TIDAK LULUS";
        return npm + " - " + nama + " [Nilai: " + nilai + " | Status: " + status + "]";
    }
}