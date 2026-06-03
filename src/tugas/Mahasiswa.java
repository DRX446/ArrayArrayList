package tugas;

public class Mahasiswa {
    private String nama;
    private String npm;
    private double nilai;

    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    public String getNama() {
        return this.nama;
    }

    public String getNpm() {
        return this.npm;
    }

    public double getNilai() {
        return this.nilai;
    }

    public boolean lulus() {
        return this.nilai >= 60.0;
    }
}