package tugas;
import java.util.ArrayList;

public class KelasKuliah {
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public KelasKuliah() {
        this.daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa m) {
        this.daftarMahasiswa.add(m);
    }

    public double hitungRataRata() {
        if (this.daftarMahasiswa.isEmpty()) return 0;
        double total = 0;
        for (Mahasiswa m : this.daftarMahasiswa) {
            total += m.getNilai();
        }
        return total / this.daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int count = 0;
        for (Mahasiswa m : this.daftarMahasiswa) {
            if (m.lulus()) {
                count++;
            }
        }
        return count;
    }

    public void tampilkanSemua() {
        for (Mahasiswa m : this.daftarMahasiswa) {
            System.out.println("Namae: " + m.getNama() + " | NPM: " + m.getNpm() + " | Seiseki: " + m.getNilai() + " | Goukaku: " + m.lulus());
        }
    }

    // Method tambahan untuk mengambil jumlah keseluruhan data
    public int getJumlahTotal() {
        return this.daftarMahasiswa.size();
    }
}