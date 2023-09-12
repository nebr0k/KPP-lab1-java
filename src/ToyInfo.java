import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ToyInfo {

    public static void main(String[] args) {
        List<Toy> toys = readFile("toys.txt");

        toys.stream()
                .filter(toy -> toy.name.equals("blocks"))
                .sorted(Comparator.comparingInt(toy -> toy.price))
                .forEach(toy -> {
                    DecimalFormat df = new DecimalFormat("00");
                    System.out.println(toy.name + " - " + (toy.price / 100) + " грн і " + df.format(toy.price % 100) + " коп. кількість: " + toy.specialAttribute);
                });
    }


    public static List<Toy> readFile(String fileName) {
        List<Toy> toys = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                toys.add(new Toy(parts[0], Integer.parseInt(parts[1]), parts[2], parts[3]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return toys;
    }
}
