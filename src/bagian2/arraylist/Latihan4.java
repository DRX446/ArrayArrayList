package bagian2.arraylist;

import java.util.ArrayList;

public class Latihan4 {

    public static void main(String[] args) {

        ArrayList<String> buah = new ArrayList<>();

        buah.add("Apel");
        buah.add("Mangga");
        buah.add("Jeruk");

        System.out.println("Awal : " + buah);

        buah.add(1, "Pisang"); // Sisip di indeks 1
        System.out.println("Sisip : " + buah);

        buah.set(0, "Anggur"); // Ganti elemen pada indeks 0
        System.out.println("Ganti : " + buah);

        buah.remove("Jeruk"); // Hapus berdasarkan nilai
        System.out.println("Hapus : " + buah);

        System.out.println("Ada Apel? : " + buah.contains("Apel"));
        System.out.println("Jumlah : " + buah.size());
    }
}