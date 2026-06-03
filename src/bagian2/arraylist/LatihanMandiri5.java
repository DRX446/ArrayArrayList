package bagian2.arraylist;
import java.util.ArrayList;
public class LatihanMandiri5 {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(70); 
        scores.add(95); 
        scores.add(60);
        scores.add(88); 
        scores.add(75);

        int maxScore = scores.get(0);

        for (int score : scores) {
            if (score > maxScore) {
                maxScore = score;
            }
        }
        
        System.out.println("Highest score: " + maxScore);
    }
}