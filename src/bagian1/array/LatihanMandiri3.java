// Latihan 1.4 No 3: Menghitung jumlah angka genap
package bagian1.array;

public class LatihanMandiri3 {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 15, 16, 23, 42};
        int evenCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Even count: " + evenCount);
    }
}