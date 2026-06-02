// Latihan 1.4 No 1: Suhu harian (Tertinggi & Terendah)
package bagian1.array;

public class LatihanMandiri1 {
    public static void main(String[] args) {
        double[] dailyTemps = {30.5, 28.0, 33.2, 27.8, 31.1, 29.4};
        double maxTemp = dailyTemps[0];
        double minTemp = dailyTemps[0];

        for (double temp : dailyTemps) {
            if (temp > maxTemp) maxTemp = temp;
            if (temp < minTemp) minTemp = temp;
        }

        System.out.println("Max: " + maxTemp);
        System.out.println("Min: " + minTemp);
    }
}