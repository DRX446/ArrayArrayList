// Latihan 1.4 No 2: Nama hari dengan huruf lebih dari 5
package bagian1.array;

public class LatihanMandiri2 {
    public static void main(String[] args) {
        // Menggunakan Romaji sesuai instruksi
        String[] days = {"Getsuyoubi", "Kayoubi", "Suiyoubi", "Mokuyoubi", "Kinyoubi"};

        for (String day : days) {
            if (day.length() > 5) {
                System.out.println(day);
            }
        }
    }
}