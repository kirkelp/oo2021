import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StreamHM {
  public static void main(String[] args) throws IOException {
    PrintWriter pw = new PrintWriter(new FileWriter("school_data.txt"));

    Files.readAllLines(Paths.get("school.txt"))
        .stream()
        .map(e -> e.split(","))
        .filter(e -> e[0].startsWith("K"))
        .filter(e -> e[1].equals("õpetaja"))
        .map(e->e[0])
        .peek(System.out::println)
        .forEach(pw::println);

    pw.close();

  }
}