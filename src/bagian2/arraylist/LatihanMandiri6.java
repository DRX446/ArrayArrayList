// Latihan 2.5 No 3: Cetak nama yang berawalan "A"
package bagian2.arraylist;
import java.util.ArrayList;
public class LatihanMandiri6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        String[] nameData = {"Alex", "Bob", "Alice", "Charlie", "Adam", "Dave"};
        
        for (String n : nameData) {
            names.add(n);
        }

        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
    }
}