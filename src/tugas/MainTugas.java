package tugas;

public class MainTugas {
    public static void main(String[] args) {
        // Persyaratan 4: Menyimpan array String mata kuliah dan menampilkannya
        String[] kamoku = {"Apurikeshon Kaihatsu", "Detabesu", "Arugorizumu"};
        System.out.println("Kamoku risuto:");
        for (String k : kamoku) {
            System.out.println("- " + k);
        }
        System.out.println("-------------------------");

        // Persyaratan 3: Membuat objek KelasKuliah dan menambah minimal 5 Mahasiswa
        KelasKuliah kelas = new KelasKuliah();

        kelas.tambahMahasiswa(new Mahasiswa("Akira", "2301", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Ren", "2302", 55.0)); // Tidak lulus
        kelas.tambahMahasiswa(new Mahasiswa("Kenji", "2303", 75.0));
        kelas.tambahMahasiswa(new Mahasiswa("Hiro", "2304", 45.0));  // Tidak lulus
        kelas.tambahMahasiswa(new Mahasiswa("Yuki", "2305", 90.0));

        System.out.println("Subete no gakusei:");
        kelas.tampilkanSemua();
        System.out.println("-------------------------");

        // Persyaratan 5: Menampilkan rata-rata dan jumlah yang lulus
        System.out.println("Heikinten: " + kelas.hitungRataRata());
        System.out.println("Goukaku-sha suu: " + kelas.jumlahLulus());
        System.out.println("-------------------------");

        // Persyaratan 6: Menambah 1 objek baru dan menampilkan jumlah data terbaru
        kelas.tambahMahasiswa(new Mahasiswa("Sho", "2306", 88.0));
        System.out.println("Atarashii gakusei o tsuika shimashita.");
        System.out.println("Gakusei no sou kazu: " + kelas.getJumlahTotal());
    }
}